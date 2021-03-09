package com.example.demo.Contants;

import org.omg.PortableInterceptor.SUCCESSFUL;

public enum Code {
    ERROR("0","登录错误"),
    ERROR_LOGIN("1","账号密码错误错误"),
    SUCCESSFUL("2","登录成功");

    private String code;
    private String desc;

    private  Code(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
