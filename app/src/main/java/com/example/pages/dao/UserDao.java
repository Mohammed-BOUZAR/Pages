package com.example.pages.dao;

import com.example.pages.model.User;

public interface UserDao {
    String getUser(String email);
    void setUser(User user);
}
