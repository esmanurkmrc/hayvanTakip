package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HayvancilikBilgiRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HayvancilikBilgiResponse;
import com.hayvanTakip.hayvanTakip.models.HayvancilikBilgi;
import com.hayvanTakip.hayvanTakip.repositories.HayvancilikBilgiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HayvancilikBilgiServiceImpl implements HayvancilikBilgiService {

    @Autowired
    private HayvancilikBilgiRepository repository;

    @Override
    public HayvancilikBilgiResponse create(HayvancilikBilgiRequest request) {
        HayvancilikBilgi bilgi = mapToEntity(request);
        return mapToResponse(repository.save(bilgi));
    }

    @Override
    public HayvancilikBilgiResponse update(Long id, HayvancilikBilgiRequest request) {
        HayvancilikBilgi bilgi = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bilgi bulunamadı"));
        bilgi.setBaslik(request.getBaslik());
        bilgi.setIcerik(request.getIcerik());
        bilgi.setKategori(request.getKategori());
        bilgi.setKaynak(request.getKaynak());
        bilgi.setResimUrl(request.getResimUrl());
        return mapToResponse(repository.save(bilgi));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public HayvancilikBilgiResponse getById(Long id) {
        return repository.findById(id)
                .map(this::mapToResponse)
                .orElseThrow(() -> new RuntimeException("Bilgi bulunamadı"));
    }

    @Override
    public List<HayvancilikBilgiResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<HayvancilikBilgiResponse> getByKategori(String kategori) {
        return repository.findByKategoriIgnoreCase(kategori)
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<HayvancilikBilgiResponse> searchByBaslik(String baslik) {
        return repository.findByBaslikContainingIgnoreCase(baslik)
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    
    private HayvancilikBilgi mapToEntity(HayvancilikBilgiRequest request) {
        HayvancilikBilgi bilgi = new HayvancilikBilgi();
        bilgi.setBaslik(request.getBaslik());
        bilgi.setIcerik(request.getIcerik());
        bilgi.setKategori(request.getKategori());
        bilgi.setKaynak(request.getKaynak());
        bilgi.setResimUrl(request.getResimUrl());
        return bilgi;
    }

    private HayvancilikBilgiResponse mapToResponse(HayvancilikBilgi bilgi) {
        HayvancilikBilgiResponse response = new HayvancilikBilgiResponse();
        response.setId(bilgi.getId());
        response.setBaslik(bilgi.getBaslik());
        response.setIcerik(bilgi.getIcerik());
        response.setKategori(bilgi.getKategori());
        response.setKaynak(bilgi.getKaynak());
        response.setResimUrl(bilgi.getResimUrl());
        return response;
    }
}
