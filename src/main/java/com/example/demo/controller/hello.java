package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "测试hello-v1";
    }
}
