package com.assist.iDesk.controller;

import com.assist.iDesk.entity.AuthRequest;
import com.assist.iDesk.service.JwtUtil;
import com.assist.iDesk.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(path="api/v1")
@AllArgsConstructor
public class WebController {
    @Autowired
    private  JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserServiceImpl userService;



    @PostMapping("/login")
    public ResponseEntity generateToken(@RequestBody AuthRequest authRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        } catch (Exception ex) {
            return new ResponseEntity<>("Bad credentials", HttpStatus.BAD_REQUEST);
        }

        HashMap<String, Object> hMap = new HashMap<>();
        hMap.put("token", jwtUtil.generateToken(authRequest.getEmail()));
        hMap.put("user", userService.getUserByEmail(authRequest.getEmail()));
        return new ResponseEntity<>(hMap, HttpStatus.OK);

    }



}
