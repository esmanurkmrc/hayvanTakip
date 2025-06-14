package com.hayvanTakip.hayvanTakip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.response.AsiTakvimiResponse;
import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import com.hayvanTakip.hayvanTakip.models.Veteriner;
import com.hayvanTakip.hayvanTakip.repositories.AsiTakvimiRepository;
import com.hayvanTakip.hayvanTakip.repositories.VeterinerRepository;

@Service
public class AsiTakvimiServiceImpl implements AsiTakvimiService {

    @Autowired
    private AsiTakvimiRepository repository;

    @Autowired
    private VeterinerRepository veterinerRepository;

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

    @Override
    public List<AsiTakvimiResponse> getAllAsiTakvimi() {
        List<AsiTakvimi> list = repository.findAll();

        return list.stream().map(asi -> {
            AsiTakvimiResponse dto = new AsiTakvimiResponse();
            dto.setId(asi.getId());
            dto.setHayvanId(asi.getHayvanId());
            dto.setUygulamaTarihi(asi.getUygulamaTarihi().toString());
            dto.setAciklama(asi.getAciklama());

            if (asi.getVeterinerId() != null) {
                Veteriner vet = veterinerRepository.findById(asi.getVeterinerId()).orElse(null);
                if (vet != null) {
                    dto.setVeterinerAdi(vet.getAd() + " " + vet.getSoyad());
                }
            }

            return dto;
        }).collect(Collectors.toList());
    }
}
