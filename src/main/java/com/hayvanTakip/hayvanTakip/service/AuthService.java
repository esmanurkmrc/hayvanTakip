package com.hayvanTakip.hayvanTakip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.LoginRequest;
import com.hayvanTakip.hayvanTakip.dtos.request.RegisterRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.LoginResponse;
import com.hayvanTakip.hayvanTakip.dtos.response.RegisterResponse;
import com.hayvanTakip.hayvanTakip.models.User;
import com.hayvanTakip.hayvanTakip.repositories.UserRepository;

@Service
public class AuthService {
    
    private final UserRepository userRepository;

    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public RegisterResponse register(RegisterRequest request) {
        User user = new User(request.getName(), null, request.getPassword(), request.getEmail(), null, null);
        userRepository.save(user); 
        return new RegisterResponse(user.getId(), user.getEmail());

    }

    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail());
    
        if (user == null || !user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
    
        String roleName = user.getRole() != null ? user.getRole().getName() : null;
    
        return new LoginResponse(user.getId(), user.getEmail(), roleName);
    }
}