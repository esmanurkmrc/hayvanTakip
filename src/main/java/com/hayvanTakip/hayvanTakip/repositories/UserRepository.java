package com.hayvanTakip.hayvanTakip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hayvanTakip.hayvanTakip.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}