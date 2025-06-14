package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.IklimVerisi;

import java.util.List;

public interface IklimVerisiService {
    IklimVerisi save(IklimVerisi veri);
    IklimVerisi update(Long id, IklimVerisi veri);
    void delete(Long id);
    IklimVerisi getById(Long id);
    List<IklimVerisi> getAll();
}
