package com.hayvanTakip.hayvanTakip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.YemStokRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.YemStokResponse;
import com.hayvanTakip.hayvanTakip.models.YemStok;
import com.hayvanTakip.hayvanTakip.repositories.YemStokRepository;

@Service
public class YemStokServiceImpl implements YemStokService {

    @Autowired
    private YemStokRepository repository;

    private YemStokResponse mapToResponse(YemStok yem) {
        YemStokResponse res = new YemStokResponse();
        res.setId(yem.getId());
        res.setYemAdi(yem.getYemAdi());
        res.setYemTuru(yem.getYemTuru());
        res.setMiktarKg(yem.getMiktarKg());
        res.setGirisTarihi(yem.getGirisTarihi());
        res.setCikisTarihi(yem.getCikisTarihi());
        res.setBirimFiyat(yem.getBirimFiyat());
        res.setAciklama(yem.getAciklama());
        return res;
    }

    @Override
    public YemStokResponse create(YemStokRequest request) {
        YemStok yem = new YemStok();
        yem.setYemAdi(request.getYemAdi());
        yem.setYemTuru(request.getYemTuru());
        yem.setMiktarKg(request.getMiktarKg());
        yem.setGirisTarihi(request.getGirisTarihi());
        yem.setCikisTarihi(request.getCikisTarihi());
        yem.setBirimFiyat(request.getBirimFiyat());
        yem.setAciklama(request.getAciklama());
        return mapToResponse(repository.save(yem));
    }

    @Override
    public YemStokResponse update(Long id, YemStokRequest request) {
        YemStok yem = repository.findById(id).orElseThrow(() -> new RuntimeException("Yem bulunamadı"));
        yem.setYemAdi(request.getYemAdi());
        yem.setYemTuru(request.getYemTuru());
        yem.setMiktarKg(request.getMiktarKg());
        yem.setGirisTarihi(request.getGirisTarihi());
        yem.setCikisTarihi(request.getCikisTarihi());
        yem.setBirimFiyat(request.getBirimFiyat());
        yem.setAciklama(request.getAciklama());
        return mapToResponse(repository.save(yem));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public YemStokResponse getById(Long id) {
        return repository.findById(id)
                .map(this::mapToResponse)
                .orElseThrow(() -> new RuntimeException("Yem bulunamadı"));
    }

    @Override
    public List<YemStokResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }
}
