package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Yapilacak;

import java.util.List;

public interface YapilacakService {
    List<Yapilacak> getAll();
    Yapilacak getById(Long id);
    Yapilacak save(Yapilacak yapilacak);
    Yapilacak update(Long id, Yapilacak yapilacak);
    void delete(Long id);
}
