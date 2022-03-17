package com.assist.iDesk.controller;

import com.assist.iDesk.entity.User;
import com.assist.iDesk.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostMapping(value ="/addAdmin")
    public ResponseEntity addUserAdmin(@RequestBody User user) {

        String pwd = user.getPassword();
        String encryptPassword = encoder.encode(pwd);
        user.setPassword(encryptPassword);
        user.setRole("Administration");
        return userService.saveUser(user);
    }

    @PostMapping(value = "/addOfficeAdmin")
    public ResponseEntity addUserOfficeAdmin(@RequestBody User user) {

        String pwd = user.getPassword();
        String encryptPassword = encoder.encode(pwd);
        user.setPassword(encryptPassword);
        user.setRole("OfficeAdministration");
        return userService.saveUser(user);
    }

    @PostMapping(value = "/addEmployee")
    public ResponseEntity addUserEmployee(@RequestBody User user) {

        String pwd = user.getPassword();
        String encryptPassword = encoder.encode(pwd);
        user.setPassword(encryptPassword);
        user.setRole("Employee");
        return userService.saveUser(user);
    }

    @GetMapping(value = "/list")
    public ResponseEntity getUsers() {

        return userService.getUsers();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity findUserById(@PathVariable Long id) {

        return userService.getUserById(id);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity updateUser(@RequestBody User user, @PathVariable Long id) {

        return userService.updateUser(user, id);

    }
    /*
    @PutMapping("/user/deactivate/{id}")
    public ResponseEntity deactivateUser(@PathVariable Long id){
        return userService.deactivateUser(id);
    }*/


}











