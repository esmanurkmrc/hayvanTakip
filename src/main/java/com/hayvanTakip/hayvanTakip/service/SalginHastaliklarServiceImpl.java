package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.SalginHastalikRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.SalginHastalikResponse;
import com.hayvanTakip.hayvanTakip.models.SalginHastaliklar;
import com.hayvanTakip.hayvanTakip.repositories.SalginHastaliklarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SalginHastaliklarServiceImpl implements SalginHastaliklarService {

    @Autowired
    private SalginHastaliklarRepository repository;

    private SalginHastalikResponse mapToResponse(SalginHastaliklar entity) {
        SalginHastalikResponse response = new SalginHastalikResponse();
        response.setId(entity.getId());
        response.setAd(entity.getAd());
        response.setBelirtiler(entity.getBelirtiler());
        response.setYayilmaDurumu(entity.getYayilmaDurumu());
        response.setKorunmaYontemleri(entity.getKorunmaYontemleri());
        response.setEtkiledigiTurler(entity.getEtkiledigiTurler());
        response.setAciklama(entity.getAciklama());
        response.setKonum(entity.getKonum());
        return response;
    }

    @Override
    public SalginHastalikResponse create(SalginHastalikRequest request) {
        SalginHastaliklar entity = new SalginHastaliklar();
        entity.setAd(request.getAd());
        entity.setBelirtiler(request.getBelirtiler());
        entity.setYayilmaDurumu(request.getYayilmaDurumu());
        entity.setKorunmaYontemleri(request.getKorunmaYontemleri());
        entity.setEtkiledigiTurler(request.getEtkiledigiTurler());
        entity.setAciklama(request.getAciklama());
        entity.setKonum(request.getKonum());
        repository.save(entity);
        return mapToResponse(entity);
    }

    @Override
    public SalginHastalikResponse update(Long id, SalginHastalikRequest request) {
        SalginHastaliklar entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Salgın hastalık bulunamadı: " + id));

        entity.setAd(request.getAd());
        entity.setBelirtiler(request.getBelirtiler());
        entity.setYayilmaDurumu(request.getYayilmaDurumu());
        entity.setKorunmaYontemleri(request.getKorunmaYontemleri());
        entity.setEtkiledigiTurler(request.getEtkiledigiTurler());
        entity.setAciklama(request.getAciklama());
        entity.setKonum(request.getKonum());

        repository.save(entity);
        return mapToResponse(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<SalginHastalikResponse> getAll() {
        return repository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public SalginHastalikResponse getById(Long id) {
        SalginHastaliklar entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Salgın hastalık bulunamadı: " + id));
        return mapToResponse(entity);
    }
}
