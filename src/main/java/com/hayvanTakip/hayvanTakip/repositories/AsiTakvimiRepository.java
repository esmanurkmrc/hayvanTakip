package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AsiTakvimiRepository extends JpaRepository<AsiTakvimi, Long> {

    List<AsiTakvimi> findByUygulamaTarihiBefore(LocalDate tarih);
}
