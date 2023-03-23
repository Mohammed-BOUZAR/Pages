package com.example.pages.dao;

import com.example.pages.model.User;

import java.util.List;
import java.util.Vector;

public class UserDaoMemory implements UserDao{
    private List<User> users;

    UserDaoMemory(){
        users = new Vector<>();
    }

    @Override
    public String getUser(String email) {
        for (User u: users) {
            if (u.getEmail().equals(email))
                return u.getName();
        }
        return null;
    }

    @Override
    public void setUser(User user) {
        User u = new User(user);
    }
}
