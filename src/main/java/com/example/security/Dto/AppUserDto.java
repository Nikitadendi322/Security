package com.example.security.Dto;

import com.example.security.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

public class AppUserDto {
    Logger logger=LoggerFactory.getLogger(AppUserDto.class);
    private int id;
    private String login;
    private String password;
    private Role role;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}


