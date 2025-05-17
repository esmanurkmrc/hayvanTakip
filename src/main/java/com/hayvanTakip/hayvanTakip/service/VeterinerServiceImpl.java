package com.hayvanTakip.hayvanTakip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.VeterinerRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.VeterinerResponse;
import com.hayvanTakip.hayvanTakip.models.Veteriner;
import com.hayvanTakip.hayvanTakip.repositories.VeterinerRepository;

@Service
public class VeterinerServiceImpl implements VeterinerService {

    @Autowired
    private VeterinerRepository repo;

    @Override
    public VeterinerResponse create(VeterinerRequest request) {
        Veteriner saved = repo.save(toEntity(request));
        return convertToResponse(saved);
    }

    @Override
    public VeterinerResponse update(Long id, VeterinerRequest request) {
        Veteriner v = repo.findById(id).orElseThrow();

        v.setAd(request.getAd());
        v.setSoyad(request.getSoyad());
        v.setTelefon(request.getTelefon());
        v.setEposta(request.getEposta());
        v.setAdres(request.getAdres());
        v.setUzmanlikAlani(request.getUzmanlikAlani());
        v.setAktif(request.getAktif());

        if (request.getSifre() != null && !request.getSifre().isEmpty()) {
            v.setSifre(request.getSifre());
        }

        return convertToResponse(repo.save(v));
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<VeterinerResponse> getAll() {
        return repo.findAll().stream().map(this::convertToResponse).collect(Collectors.toList());
    }

    @Override
    public VeterinerResponse getById(Long id) {
        return convertToResponse(repo.findById(id).orElseThrow());
    }

    @Override
    public VeterinerResponse convertToResponse(Veteriner v) {
        VeterinerResponse dto = new VeterinerResponse();
        dto.setId(v.getId());
        dto.setAd(v.getAd());
        dto.setSoyad(v.getSoyad());
        dto.setTelefon(v.getTelefon());
        dto.setEposta(v.getEposta());
        dto.setAdres(v.getAdres());
        dto.setUzmanlikAlani(v.getUzmanlikAlani());
        dto.setAktif(v.getAktif());
        return dto;
    }

    private Veteriner toEntity(VeterinerRequest r) {
        Veteriner v = new Veteriner();
        v.setAd(r.getAd());
        v.setSoyad(r.getSoyad());
        v.setTelefon(r.getTelefon());
        v.setEposta(r.getEposta());
        v.setAdres(r.getAdres());
        v.setUzmanlikAlani(r.getUzmanlikAlani());
        v.setAktif(r.getAktif());

        if (r.getSifre() != null) {
            v.setSifre(r.getSifre());
        }

        return v;
    }
}
