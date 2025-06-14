package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Barinak;
import com.hayvanTakip.hayvanTakip.repositories.BarinakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarinakServiceImpl implements BarinakService {

    @Autowired
    private BarinakRepository barinakRepository;

    @Override
    public Barinak save(Barinak barinak) {
        return barinakRepository.save(barinak);
    }

    @Override
    public Barinak update(Long id, Barinak barinak) {
        Barinak existing = barinakRepository.findById(id).orElseThrow();
        existing.setAd(barinak.getAd());
        existing.setKonum(barinak.getKonum());
        existing.setTip(barinak.getTip());
        existing.setAktif(barinak.getAktif());
        return barinakRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        barinakRepository.deleteById(id);
    }

    @Override
    public Barinak getById(Long id) {
        return barinakRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Barinak> getAll() {
        return barinakRepository.findAll();
    }
}
