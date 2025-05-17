package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.SalginHastaliklar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalginHastaliklarRepository extends JpaRepository<SalginHastaliklar, Long> {
    
}
