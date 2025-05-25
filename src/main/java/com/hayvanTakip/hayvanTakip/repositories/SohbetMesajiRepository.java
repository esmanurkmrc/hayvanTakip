package com.hayvanTakip.hayvanTakip.repositories;

import com.hayvanTakip.hayvanTakip.models.SohbetMesaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SohbetMesajiRepository extends JpaRepository<SohbetMesaji, Long> {

    List<SohbetMesaji> findByGonderenIdAndAliciIdOrAliciIdAndGonderenId(
        Long g1, Long a1, Long g2, Long a2
    );
}
