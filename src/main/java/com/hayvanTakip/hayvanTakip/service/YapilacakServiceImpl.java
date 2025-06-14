package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Yapilacak;
import com.hayvanTakip.hayvanTakip.repositories.YapilacakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YapilacakServiceImpl implements YapilacakService {

    @Autowired
    private YapilacakRepository yapilacakRepository;

    @Override
    public List<Yapilacak> getAll() {
        return yapilacakRepository.findAll();
    }

    @Override
    public Yapilacak getById(Long id) {
        return yapilacakRepository.findById(id).orElse(null);
    }

    @Override
    public Yapilacak save(Yapilacak yapilacak) {
        return yapilacakRepository.save(yapilacak);
    }

    @Override
    public Yapilacak update(Long id, Yapilacak yapilacak) {
        Yapilacak mevcut = yapilacakRepository.findById(id).orElseThrow();
        mevcut.setBaslik(yapilacak.getBaslik());
        mevcut.setAciklama(yapilacak.getAciklama());
        mevcut.setOnemDerecesi(yapilacak.getOnemDerecesi());
        mevcut.setTamamlandi(yapilacak.getTamamlandi());
        return yapilacakRepository.save(mevcut);
    }

    @Override
    public void delete(Long id) {
        yapilacakRepository.deleteById(id);
    }
}
