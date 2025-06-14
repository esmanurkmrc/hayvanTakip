package com.hayvanTakip.hayvanTakip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hayvanTakip.hayvanTakip.models.HastalikBelirti;

public interface HastalikBelirtiRepository extends JpaRepository<HastalikBelirti, Long> {

    List<HastalikBelirti> findByBelirtiId(Long belirtiId);

    
    @Query("SELECT h.hastalikAdi, COUNT(hb.belirtiId) " +
           "FROM HastalikBelirti hb JOIN Hastalik h ON hb.hastalikId = h.id " +
           "GROUP BY h.hastalikAdi")
    List<Object[]> getBelirtiSayilariByHastalik();
}
