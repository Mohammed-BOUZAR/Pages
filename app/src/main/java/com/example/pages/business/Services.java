package com.example.pages.business;

import com.example.pages.model.User;

public interface Services {
    String getUser(String email);
    void setUser(User user);
}
