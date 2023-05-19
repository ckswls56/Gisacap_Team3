package com.example.team3.controller;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.team3.Model.GPTParam;
import com.example.team3.repository.GPTParamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {

    @Autowired
    GPTParamRepository gptParamRepository;
    private static final String CURR_IMAGE_REPO_PATH = "C:\\upload";

    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public ResponseEntity<String> upload(MultipartHttpServletRequest multipartRequest,
                          GPTParam gptParam) throws Exception{
        multipartRequest.setCharacterEncoding("utf-8");
        LocalDateTime uploadTime = LocalDateTime.now();
        //image 저장 후 이름 리스트 반환
        String path = CURR_IMAGE_REPO_PATH+"\\"+gptParam.getUserId()+"\\"+uploadTime.toLocalDate()+"_"+uploadTime.getHour()+"_"+uploadTime.getMinute()+"_"+uploadTime.getSecond();
        List fileList = fileProcess(multipartRequest,path);

        gptParam.setPhotoRef(path);
        gptParam.setElkTime(uploadTime);
        gptParamRepository.save(gptParam);


        return new ResponseEntity<>(fileList.toString(), HttpStatus.OK);
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
