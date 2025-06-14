package com.hayvanTakip.hayvanTakip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hayvanTakip.hayvanTakip.models.Yapilacak;

@Repository
public interface YapilacakRepository extends JpaRepository<Yapilacak, Long> {
   
}
