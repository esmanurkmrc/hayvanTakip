package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.Hastalik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HastalikRepository extends JpaRepository<Hastalik, Long> {
    Optional<Hastalik> findByHastalikAdi(String hastalikAdi);
}
