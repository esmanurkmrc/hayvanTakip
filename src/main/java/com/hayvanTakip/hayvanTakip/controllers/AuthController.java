package com.hayvanTakip.hayvanTakip.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayvanTakip.hayvanTakip.dtos.request.LoginRequest;
import com.hayvanTakip.hayvanTakip.dtos.request.RegisterRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.LoginResponse;
import com.hayvanTakip.hayvanTakip.dtos.response.RegisterResponse;
import com.hayvanTakip.hayvanTakip.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}