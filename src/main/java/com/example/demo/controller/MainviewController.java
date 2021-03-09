package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainviewController {
    @RequestMapping("/mainview")
    public String mainview(){
        System.out.println("1234");
//        System.out.println("欢迎"+ userService.getUsername(name));
        return "mainview"; //当浏览器输入/index时，会返回 /static/home.html的页面
    }
}
