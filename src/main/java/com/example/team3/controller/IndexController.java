package com.example.team3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


@Controller
public class IndexController {
    @GetMapping("/")
    public String main() {
        return "main";
    }
    @GetMapping("/result")
    public String showResultPage(@RequestParam("filePath") String encodedFilePath, Model model) throws UnsupportedEncodingException {
        String filePath = URLDecoder.decode(encodedFilePath, "UTF-8");
        model.addAttribute("filePath", filePath);
        return "result";
    }

}
