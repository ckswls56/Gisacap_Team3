package com.example.team3.controller;

import com.example.team3.util.SolList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;


@Controller
public class IndexController {
    @GetMapping("/")
    public String main() {
        return "main";
    }
    @GetMapping("/result")
    public String showResultPage(@RequestParam("filePath") String encodedFilePath, Model model) throws UnsupportedEncodingException {
        String path = URLEncoder.encode(encodedFilePath,"UTF-8");
        model.addAttribute("filePath",path);
        return "result";
    }

    @PostMapping("/expertInput")
    public ResponseEntity<List<Map<String, Object>>> responseExpert(@RequestBody List<String> symtoms) {
        List<Map<String, Object>> diseaseList = new ArrayList<>();

        HashMap<String, List<Integer>> symMap = new SolList().getSymList();
        HashMap<String, String> disMap = new SolList().getDisList();
        HashMap<String, String> solMap = new SolList().getSolList();

        //무증상 일때
        if(symtoms == null || symtoms.isEmpty()) {
            Map<String, Object> disease = new LinkedHashMap<>();
            disease.put("name",disMap.get("d0"));
            disease.put("sol", solMap.get("d0"));
            diseaseList.add(disease);

            return ResponseEntity.ok(diseaseList);
        }
        else {
            int[] possiblility = new int[13];
            int max = 0;

            //각 증상에 의해 일어날 수 있는 병들의 가능성 수치를 1씩 증가
            for (String symtom : symtoms) {
                List<Integer> dieases = symMap.get(symtom);
                for (Integer index : dieases) {
                    possiblility[index]++;
                }
            }

            //가능성 중에서 최대값 구하기
            for (Integer num : possiblility) {
                if (num > max) max = num;
            }

            //최대값과 일치하는 가능성을 가진 인덱스들을 저장
            for (int i = 0; i < 13; i++) {
                if (possiblility[i] == max) {
                    Map<String, Object> disease = new LinkedHashMap<>();
                    disease.put("name", disMap.get("d" + i));
                    disease.put("sol", solMap.get("d" + i));
                    diseaseList.add(disease);
                }
            }

            return ResponseEntity.ok(diseaseList);
        }
    }
}
