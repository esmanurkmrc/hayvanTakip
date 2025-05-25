package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RandevuRepository extends JpaRepository<Randevu, Long> {

    List<Randevu> findByTarihBeforeAndDurum(LocalDate tarih, String durum);
}
