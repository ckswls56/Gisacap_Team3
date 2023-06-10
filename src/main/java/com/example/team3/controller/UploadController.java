package com.example.team3.controller;

import java.io.File;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.util.*;

import com.example.team3.Model.ELK;
import com.example.team3.Model.GPTParam;
import com.example.team3.repository.GPTParamRepository;
import com.example.team3.service.GPTParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {

    @Autowired
    GPTParamRepository gptParamRepository;
    GPTParamService gptParamService;
    private static final String CURR_IMAGE_REPO_PATH = "E:\\cap\\Team3\\src\\main\\webapp\\resources\\images";

    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public String upload(MultipartHttpServletRequest multipartRequest,
                         @RequestParam("symptom") List<String> symptoms,
                          GPTParam gptParam) throws Exception{
        multipartRequest.setCharacterEncoding("utf-8");
        LocalDateTime uploadTime = LocalDateTime.now();
        //image 저장 후 이름 리스트 반환
        String path = CURR_IMAGE_REPO_PATH+"\\"+gptParam.getUserId()+"\\"+uploadTime.toLocalDate()+"_"+uploadTime.getHour()+"_"+uploadTime.getMinute()+"_"+uploadTime.getSecond();
        List fileList = fileProcess(multipartRequest,path);
        //ELK closestELKObject = gptParamService.findClosestELKObject(); // 현재시간과 가장 가까운 ELK 정보를 가져옴 (uploadTime을 그냥 사용할까 LocalDateTime 형식을 몰겠슴
        //gptParam.setElkTime(closestELKObject.getElkTime());
        gptParam.setPhotoRef(path);

        gptParamRepository.save(gptParam);
        String encodedFilePath = URLEncoder.encode(gptParam.getUserId()+"\\"+uploadTime.toLocalDate()+"_"+uploadTime.getHour()+"_"+uploadTime.getMinute()+"_"+uploadTime.getSecond()+"\\"+fileList.get(0).toString(), "UTF-8");
        System.out.println(encodedFilePath);
        String symptomParam = String.join(",", symptoms);  // 증상 리스트를 쉼표로 연결하여 하나의 문자열로 만듭니다.
        symptomParam = URLEncoder.encode(symptomParam, "UTF-8");  // URL에 안전하게 추가할 수 있도록 인코딩합니다.

        System.out.println(encodedFilePath);
        return "redirect:/result?filePath="+encodedFilePath+"&symptom="+symptomParam;
    }

    private List<String> fileProcess(MultipartHttpServletRequest multipartRequest,
                                     String path)
            throws Exception{
        List<String> fileList = new ArrayList<String>();
        Iterator<String> fileNames = multipartRequest.getFileNames();
        File dir = new File(path);
        Files.createDirectories(dir.toPath());
        while(fileNames.hasNext()) {
            String fileName = fileNames.next();
            MultipartFile mFile = multipartRequest.getFile(fileName);
            String originalFileName = mFile.getOriginalFilename();
            fileList.add(originalFileName);
            if(mFile.getSize() != 0) {
                mFile.transferTo(new File(dir.getPath() + "\\" + originalFileName));
            }
        }
        return fileList;
    }
}
