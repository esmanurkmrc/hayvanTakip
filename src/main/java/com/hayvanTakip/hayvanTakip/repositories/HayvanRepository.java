package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.Hayvan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HayvanRepository extends JpaRepository<Hayvan, Long> {
}
