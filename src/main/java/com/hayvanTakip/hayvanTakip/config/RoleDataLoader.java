package com.hayvanTakip.hayvanTakip.config;

import com.hayvanTakip.hayvanTakip.models.Role;
import com.hayvanTakip.hayvanTakip.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleDataLoader implements CommandLineRunner {

    private final RoleRepository roleRepository;

    public RoleDataLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        if (roleRepository.count() == 0) {
            Role r1 = new Role();
            r1.setName("Kullanıcı");

            Role r2 = new Role();
            r2.setName("Veteriner");

            roleRepository.save(r1);
            roleRepository.save(r2);

            System.out.println("✅ Role verileri başarıyla yüklendi.");
        } else {
            System.out.println("ℹ️ Role verileri zaten mevcut.");
        }
    }
}
