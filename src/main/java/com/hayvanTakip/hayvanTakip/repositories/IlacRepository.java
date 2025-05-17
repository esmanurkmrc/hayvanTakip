package com.hayvanTakip.hayvanTakip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hayvanTakip.hayvanTakip.models.Ilac;
import java.util.Optional;

@Repository
public interface IlacRepository extends JpaRepository<Ilac, Long> {
    Optional<Ilac> findByIlacAdi(String ilacAdi);
}
