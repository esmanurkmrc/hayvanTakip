package com.hayvanTakip.hayvanTakip.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hayvanTakip.hayvanTakip.models.SikSorulanSoru;

@Repository
public interface SikSorulanSoruRepository extends JpaRepository<SikSorulanSoru, Long> {
    
}
