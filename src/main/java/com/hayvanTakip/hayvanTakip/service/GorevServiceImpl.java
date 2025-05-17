package com.hayvanTakip.hayvanTakip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.builder.GorevBuilder;
import com.hayvanTakip.hayvanTakip.dtos.request.GorevRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.GorevResponse;
import com.hayvanTakip.hayvanTakip.models.Gorev;
import com.hayvanTakip.hayvanTakip.repositories.GorevRepository;

@Service
public class GorevServiceImpl implements GorevService {

    private final GorevRepository gorevRepository;

    @Autowired
    public GorevServiceImpl(GorevRepository gorevRepository) {
        this.gorevRepository = gorevRepository;
    }

    @Override
    public GorevResponse create(GorevRequest request) {
        Gorev gorev = new GorevBuilder().fromRequest(request).build();
        return toResponse(gorevRepository.save(gorev));
    }

    @Override
    public GorevResponse update(Long id, GorevRequest request) {
        Gorev gorev = gorevRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Görev bulunamadı"));

        gorev.setGorevAdi(request.getGorevAdi());
        gorev.setAciklama(request.getAciklama());
        gorev.setTarih(request.getTarih());
        gorev.setSaat(request.getSaat());
        gorev.setDurum(request.getDurum());

        return toResponse(gorevRepository.save(gorev));
    }

    @Override
    public void delete(Long id) {
        gorevRepository.deleteById(id);
    }

    @Override
    public GorevResponse getById(Long id) {
        return gorevRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new RuntimeException("Görev bulunamadı"));
    }

    @Override
    public List<GorevResponse> getAll() {
        return gorevRepository.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<GorevResponse> getByVeterinerId(Long veterinerId) {
        return gorevRepository.findByVeterinerId(veterinerId)
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

   
    private GorevResponse toResponse(Gorev gorev) {
        GorevResponse response = new GorevResponse();
        response.setId(gorev.getId());
        response.setVeterinerId(gorev.getVeterinerId());
        response.setGorevAdi(gorev.getGorevAdi());
        response.setAciklama(gorev.getAciklama());
        response.setTarih(gorev.getTarih());
        response.setSaat(gorev.getSaat());
        response.setDurum(gorev.getDurum());
        return response;
    }
}
