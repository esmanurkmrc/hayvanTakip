package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import com.hayvanTakip.hayvanTakip.repositories.AsiTakvimiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsiTakvimiServiceImpl implements AsiTakvimiService {

    @Autowired
    private AsiTakvimiRepository repository;

    @Override
    public AsiTakvimi create(AsiTakvimi asi) {
        return repository.save(asi);
    }

    @Override
    public AsiTakvimi update(Long id, AsiTakvimi asi) {
        AsiTakvimi existing = repository.findById(id).orElseThrow();
        existing.setHayvanId(asi.getHayvanId());
        existing.setUygulamaTarihi(asi.getUygulamaTarihi());
        existing.setVeterinerId(asi.getVeterinerId());
        existing.setAciklama(asi.getAciklama());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AsiTakvimi> getAll() {
        return repository.findAll();
    }

    @Override
    public AsiTakvimi getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
