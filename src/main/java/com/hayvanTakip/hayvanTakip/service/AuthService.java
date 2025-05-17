package com.hayvanTakip.hayvanTakip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.LoginRequest;
import com.hayvanTakip.hayvanTakip.dtos.request.RegisterRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.LoginResponse;
import com.hayvanTakip.hayvanTakip.dtos.response.RegisterResponse;
import com.hayvanTakip.hayvanTakip.models.Role;
import com.hayvanTakip.hayvanTakip.models.User;
import com.hayvanTakip.hayvanTakip.repositories.RoleRepository;
import com.hayvanTakip.hayvanTakip.repositories.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository; 

    @Autowired
    public AuthService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public RegisterResponse register(RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()) != null) {
            throw new RuntimeException("Bu e-posta adresi zaten kayıtlı.");
        }

        
        Role role = roleRepository.findById(request.getRoleId())
                .orElseThrow(() -> new RuntimeException("Geçersiz rol ID."));

        
        User user = new User(
                request.getName(),
                null,
                request.getPassword(),
                request.getEmail(),
                null,
                null
        );
        user.setRole(role); 

        userRepository.save(user);

        return new RegisterResponse(user.getId(), user.getEmail());
    }

    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail());

        if (user == null) {
            throw new RuntimeException("Bu e-posta adresiyle kayıtlı bir kullanıcı bulunamadı.");
        }

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Şifre yanlış. Lütfen tekrar deneyin.");
        }

        String roleName = user.getRole() != null ? user.getRole().getName() : null;

        return new LoginResponse(user.getId(), user.getEmail(), roleName);
    }
}
