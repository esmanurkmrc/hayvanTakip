package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Gelir;
import java.util.List;

public interface GelirService {
    List<Gelir> getAll();
    Gelir getById(Long id);
    Gelir save(Gelir gelir);
    void delete(Long id);
}
