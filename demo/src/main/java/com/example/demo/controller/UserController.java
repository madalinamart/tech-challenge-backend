package com.example.demo.controller;

import com.example.demo.entity.AuthRequest;
import com.example.demo.service.JwtUtil;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController

public class UserController {
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity generateToken(@RequestBody AuthRequest authRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        } catch (Exception ex) {
            return new ResponseEntity<>("Bad credentials", HttpStatus.BAD_REQUEST);
        }

        HashMap<String, Object> hmap = new HashMap<>();
        hmap.put("token", jwtUtil.generateToken(authRequest.getEmail()));
        hmap.put("user", userService.getUserByEmail(authRequest.getEmail()));
        return new ResponseEntity<>(hmap, HttpStatus.OK);

    }



}
