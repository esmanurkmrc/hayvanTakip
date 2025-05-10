package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Gider;

import java.util.List;

public interface GiderService {
    List<Gider> getAll();
    Gider getById(Long id);
    Gider save(Gider gider);
    void delete(Long id);
}
