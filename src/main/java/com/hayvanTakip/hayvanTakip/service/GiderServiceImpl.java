package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Gider;
import com.hayvanTakip.hayvanTakip.repositories.GiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiderServiceImpl implements GiderService {

    @Autowired
    private GiderRepository giderRepository;

    @Override
    public List<Gider> getAll() {
        return giderRepository.findAll();
    }

    @Override
    public Gider getById(Long id) {
        return giderRepository.findById(id).orElse(null);
    }

    @Override
    public Gider save(Gider gider) {
        return giderRepository.save(gider);
    }

    @Override
    public void delete(Long id) {
        giderRepository.deleteById(id);
    }
}
