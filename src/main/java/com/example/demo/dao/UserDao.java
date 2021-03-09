package com.example.demo.dao;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserDao {
    UserBean login(@Param("username") String username);

}
