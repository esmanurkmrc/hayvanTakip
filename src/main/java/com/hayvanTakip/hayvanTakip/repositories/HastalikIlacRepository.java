package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.HastalikIlac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HastalikIlacRepository extends JpaRepository<HastalikIlac, Long> {

    List<HastalikIlac> findByHastalikId(Long hastalikId);
    
}
