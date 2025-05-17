package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.BeslenmeKaydi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeslenmeRepository extends JpaRepository<BeslenmeKaydi, Long> {
}
