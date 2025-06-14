package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Barinak;

import java.util.List;

public interface BarinakService {
    Barinak save(Barinak barinak);
    Barinak update(Long id, Barinak barinak);
    void delete(Long id);
    Barinak getById(Long id);
    List<Barinak> getAll();
}
