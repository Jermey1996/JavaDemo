package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/login")
    public Result login(String name, String password){
        System.out.println("欢迎"+ userService.login(name,password));
//        Result res=userService.login(name,password);
//        res.getCode();
//        Object obj=res.getData();
//        UserBean userBean= (UserBean) obj;
//        userBean.getUserid();
        return userService.login(name,password);
    }
}
