package com.example.demo.service.impl;

import com.example.demo.Contants.Code;
import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserDao;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Result login(String username, String password) {
        Result res=new Result();
        UserBean u= userDao.login(username);
        if(u==null)
        {
            res.setCode(Code.ERROR.getCode());
            res.setMessage(Code.ERROR.getDesc());
            return  res;
        }
        if(!u.getPassword().equals(password))
        {
            res.setCode(Code.ERROR_LOGIN.getCode());
            res.setMessage(Code.ERROR_LOGIN.getDesc());
            return  res;
        }
        else {
            res.setCode(Code.SUCCESSFUL.getCode());
            res.setMessage(Code.SUCCESSFUL.getDesc());
            return  res;
        }

    }
}
