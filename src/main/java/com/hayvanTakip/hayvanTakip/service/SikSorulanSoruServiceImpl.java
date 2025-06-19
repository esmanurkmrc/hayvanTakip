package com.hayvanTakip.hayvanTakip.service;


import com.hayvanTakip.hayvanTakip.dtos.request.SikSoruRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.SikSoruResponse;
import com.hayvanTakip.hayvanTakip.factory.SikSoruFactory;
import com.hayvanTakip.hayvanTakip.models.SikSorulanSoru;
import com.hayvanTakip.hayvanTakip.repositories.SikSorulanSoruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SikSorulanSoruServiceImpl implements SikSorulanSoruService {

    @Autowired
    private SikSorulanSoruRepository repository;

    @Autowired
    private SikSoruFactory sikSoruFactory;

    @Override
    public SikSoruResponse ekle(SikSoruRequest request) {
        SikSorulanSoru soru = sikSoruFactory.createSoru(request);
        SikSorulanSoru saved = repository.save(soru);
        return mapToResponse(saved);
    }

    @Override
    public List<SikSoruResponse> listele() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public SikSoruResponse guncelle(Long id, SikSoruRequest request) {
        SikSorulanSoru soru = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Soru bulunamadı: " + id));
        soru.setSoru(request.getSoru());
        soru.setCevap(request.getCevap());
        soru.setKategori(request.getKategori());
        return mapToResponse(repository.save(soru));
    }

    @Override
    public void sil(Long id) {
        repository.deleteById(id);
    }

    private SikSoruResponse mapToResponse(SikSorulanSoru entity) {
        SikSoruResponse response = new SikSoruResponse();
        response.setId(entity.getId());
        response.setSoru(entity.getSoru());
        response.setCevap(entity.getCevap());
        response.setKategori(entity.getKategori());
        response.setEklenmeTarihi(entity.getEklenmeTarihi());
        return response;
    }
}
