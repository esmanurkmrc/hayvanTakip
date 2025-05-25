package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.IlacStok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IlacStokRepository extends JpaRepository<IlacStok, Long> {

    List<IlacStok> findByIlacId(Long ilacId);

   
    List<IlacStok> findByMiktarLessThanEqual(int miktar);
}
