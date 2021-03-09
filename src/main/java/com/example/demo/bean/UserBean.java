package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserBean {
    String username;

    @Id
    String userid;

    String password;

    public String getUserid(){
        return userid;
    }

    public void setUserid(String userid) {
        this.userid= userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
