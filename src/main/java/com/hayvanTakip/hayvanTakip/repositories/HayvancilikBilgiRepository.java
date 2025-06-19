package com.hayvanTakip.hayvanTakip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hayvanTakip.hayvanTakip.models.HayvancilikBilgi;

@Repository
public interface HayvancilikBilgiRepository extends JpaRepository<HayvancilikBilgi, Long> {

    
    List<HayvancilikBilgi> findByKategoriIgnoreCase(String kategori);

    
    List<HayvancilikBilgi> findByBaslikContainingIgnoreCase(String baslik);
}
