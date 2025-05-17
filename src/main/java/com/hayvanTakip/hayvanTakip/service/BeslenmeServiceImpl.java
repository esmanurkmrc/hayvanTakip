package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.BeslenmeRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.BeslenmeResponse;
import com.hayvanTakip.hayvanTakip.models.BeslenmeKaydi;
import com.hayvanTakip.hayvanTakip.repositories.BeslenmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BeslenmeServiceImpl implements BeslenmeService {

    @Autowired
    private BeslenmeRepository repository;

    private BeslenmeResponse mapToResponse(BeslenmeKaydi b) {
        BeslenmeResponse r = new BeslenmeResponse();
        r.setId(b.getId());
        r.setHayvanId(b.getHayvanId());
        r.setYemAdi(b.getYemAdi());
        r.setMiktarKg(b.getMiktarKg());
        r.setTarih(b.getTarih());
        r.setNotlar(b.getNotlar());
        r.setVeterinerId(b.getVeterinerId());
        return r;
    }

    @Override
    public BeslenmeResponse create(BeslenmeRequest request) {
        BeslenmeKaydi b = new BeslenmeKaydi();
        b.setHayvanId(request.getHayvanId());
        b.setYemAdi(request.getYemAdi());
        b.setMiktarKg(request.getMiktarKg());
        b.setTarih(request.getTarih());
        b.setNotlar(request.getNotlar());
        b.setVeterinerId(request.getVeterinerId());
        return mapToResponse(repository.save(b));
    }

    @Override
    public BeslenmeResponse update(Long id, BeslenmeRequest request) {
        BeslenmeKaydi b = repository.findById(id).orElseThrow(() -> new RuntimeException("Beslenme kaydı bulunamadı"));
        b.setHayvanId(request.getHayvanId());
        b.setYemAdi(request.getYemAdi());
        b.setMiktarKg(request.getMiktarKg());
        b.setTarih(request.getTarih());
        b.setNotlar(request.getNotlar());
        b.setVeterinerId(request.getVeterinerId());
        return mapToResponse(repository.save(b));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<BeslenmeResponse> getAll() {
        return repository.findAll().stream().map(this::mapToResponse).collect(Collectors.toList());
    }
}
