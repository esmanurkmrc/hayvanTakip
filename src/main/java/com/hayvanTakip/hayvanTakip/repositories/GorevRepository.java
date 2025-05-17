package com.hayvanTakip.hayvanTakip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hayvanTakip.hayvanTakip.models.Gorev;

@Repository
public interface GorevRepository extends JpaRepository<Gorev, Long> {
    List<Gorev> findByVeterinerId(Long veterinerId);
}
