package com.assist.iDesk.controller;

import com.assist.iDesk.entity.User;
import com.assist.iDesk.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostMapping("/user/addUserAdmin")
    public User addUserAdmin(@RequestBody User user){

        String pwd=user.getPassword();
        String encryptPassword = encoder.encode(pwd);
        user.setPassword(encryptPassword);
        user.setRole("Administration");
        return userService.saveUser(user);
    }
    @PostMapping("/user/addUserOfficeAdmin")
    public User addUserOfficeAdmin(@RequestBody User user){

        String pwd=user.getPassword();
        String encryptPassword = encoder.encode(pwd);
        user.setPassword(encryptPassword);
        user.setRole("OfficeAdministration");
        return userService.saveUser(user);
    }
    @PostMapping("/user/addUserEmployee")
    public User addUserEmployee(@RequestBody User user){

        String pwd=user.getPassword();
        String encryptPassword = encoder.encode(pwd);
        user.setPassword(encryptPassword);
        user.setRole("Employee");
        return userService.saveUser(user);
    }
    @GetMapping("/user/list")
    public List<User> getUsers() {

        return userService.getUsers();
    }

    @GetMapping("/user/id/{id}")
    public ResponseEntity findUserById(@PathVariable int id) {

        return userService.getUserById(id);
    }
    @PutMapping("/user/update/{id}")
    public ResponseEntity updateUser(@RequestBody User user, @PathVariable int id) {

        return userService.updateUser(user, id);

    }








}

