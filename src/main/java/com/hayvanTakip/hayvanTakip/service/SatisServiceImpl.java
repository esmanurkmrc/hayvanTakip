package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Satis;
import com.hayvanTakip.hayvanTakip.repositories.SatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SatisServiceImpl implements SatisService {

    @Autowired
    private SatisRepository satisRepository;

    @Override
    public List<Satis> getAll() {
        return satisRepository.findAll();
    }

    @Override
    public Satis getById(Long id) {
        return satisRepository.findById(id).orElse(null);
    }

    @Override
    public Satis save(Satis satis) {
        return satisRepository.save(satis);
    }

    @Override
    public void delete(Long id) {
        satisRepository.deleteById(id);
    }
}
