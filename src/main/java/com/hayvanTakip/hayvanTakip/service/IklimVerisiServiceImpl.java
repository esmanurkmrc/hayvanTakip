package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.IklimVerisi;
import com.hayvanTakip.hayvanTakip.repositories.IklimVerisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IklimVerisiServiceImpl implements IklimVerisiService {

    @Autowired
    private IklimVerisiRepository iklimVerisiRepository;

    @Override
    public IklimVerisi save(IklimVerisi veri) {
        return iklimVerisiRepository.save(veri);
    }

    @Override
    public IklimVerisi update(Long id, IklimVerisi veri) {
        IklimVerisi existing = iklimVerisiRepository.findById(id).orElseThrow();
        existing.setSicaklik(veri.getSicaklik());
        existing.setNem(veri.getNem());
        existing.setRuzgarHizi(veri.getRuzgarHizi());
        existing.setYagisMiktari(veri.getYagisMiktari());
        existing.setOlcumTarihi(veri.getOlcumTarihi());

        if (veri.getBarinak() != null) {
            existing.setBarinak(veri.getBarinak());
        }

        return iklimVerisiRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        iklimVerisiRepository.deleteById(id);
    }

    @Override
    public IklimVerisi getById(Long id) {
        return iklimVerisiRepository.findById(id).orElseThrow();
    }

    @Override
    public List<IklimVerisi> getAll() {
        return iklimVerisiRepository.findAll();
    }
}
