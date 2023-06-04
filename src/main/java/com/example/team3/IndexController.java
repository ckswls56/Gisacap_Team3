package com.example.team3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Getmapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String main() {
        return "main";
    }
}
