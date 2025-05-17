package com.hayvanTakip.hayvanTakip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayvanTakip.hayvanTakip.models.Veteriner;

public interface VeterinerRepository extends JpaRepository<Veteriner, Long> {
    Veteriner findByEposta(String eposta);
}
