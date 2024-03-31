package com.carlos.springboot.webapp.springbootwebapp.models.DTOS;

import com.carlos.springboot.webapp.springbootwebapp.models.User;

public class UserDTO {
    private String title;
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
