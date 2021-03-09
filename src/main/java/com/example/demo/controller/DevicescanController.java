package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DevicescanController {

    @RequestMapping("/devicescan")
    public String devicescan(){
        System.out.println("1234");
//        System.out.println("欢迎"+ userService.getUsername(name));
        return "devicescan"; //当浏览器输入/index时，会返回 /static/home.html的页面
    }
}
