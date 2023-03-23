package com.example.pages.business;

import com.example.pages.dao.UserDao;
import com.example.pages.model.User;

public class DefaultServices implements Services{
    private UserDao userDao;
    DefaultServices(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public String getUser(String email) {
        return userDao.getUser(email);
    }

    @Override
    public void setUser(User user) {
        userDao.setUser(user);
    }
}
