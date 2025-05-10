
package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.Gelir;
import com.hayvanTakip.hayvanTakip.repositories.GelirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GelirServiceImpl implements GelirService {

    @Autowired
    private GelirRepository gelirRepository;

    public List<Gelir> getAll() {
        return gelirRepository.findAll();
    }

    public Gelir getById(Long id) {
        return gelirRepository.findById(id).orElse(null);
    }

    public Gelir save(Gelir gelir) {
        return gelirRepository.save(gelir);
    }

    public void delete(Long id) {
        gelirRepository.deleteById(id);
    }
}
