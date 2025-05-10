package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Satis;

import java.util.List;

public interface SatisService {
    List<Satis> getAll();
    Satis getById(Long id);
    Satis save(Satis satis);
    void delete(Long id);
}
