package com.assist.iDesk.service;

import com.assist.iDesk.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String email);
    List<User> getUsers();

}
