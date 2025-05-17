package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HastalikRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HastalikResponse;
import com.hayvanTakip.hayvanTakip.models.Hastalik;
import com.hayvanTakip.hayvanTakip.repositories.HastalikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HastalikServiceImpl implements HastalikService {

    @Autowired
    private HastalikRepository repo;

    private HastalikResponse toDto(Hastalik h) {
        HastalikResponse dto = new HastalikResponse();
        dto.setId(h.getId());
        dto.setHayvanId(h.getHayvanId());
        dto.setHastalikAdi(h.getHastalikAdi());
        dto.setBelirtiler(h.getBelirtiler());
        dto.setTaniTarihi(h.getTaniTarihi());
        dto.setTedavi(h.getTedavi());
        dto.setIlacAdi(h.getIlacAdi());
        dto.setDozaj(h.getDozaj());
        dto.setSureGun(h.getSureGun());
        dto.setVeterinerId(h.getVeterinerId());
        dto.setAciklama(h.getAciklama());
        return dto;
    }

    private Hastalik toEntity(HastalikRequest r) {
        Hastalik h = new Hastalik();
        h.setHayvanId(r.getHayvanId());
        h.setHastalikAdi(r.getHastalikAdi());
        h.setBelirtiler(r.getBelirtiler());
        h.setTaniTarihi(r.getTaniTarihi());
        h.setTedavi(r.getTedavi());
        h.setIlacAdi(r.getIlacAdi());
        h.setDozaj(r.getDozaj());
        h.setSureGun(r.getSureGun());
        h.setVeterinerId(r.getVeterinerId());
        h.setAciklama(r.getAciklama());
        return h;
    }

    @Override
    public HastalikResponse create(HastalikRequest request) {
        return toDto(repo.save(toEntity(request)));
    }

    @Override
    public HastalikResponse update(Long id, HastalikRequest request) {
        Hastalik h = repo.findById(id).orElseThrow();
        h.setHayvanId(request.getHayvanId());
        h.setHastalikAdi(request.getHastalikAdi());
        h.setBelirtiler(request.getBelirtiler());
        h.setTaniTarihi(request.getTaniTarihi());
        h.setTedavi(request.getTedavi());
        h.setIlacAdi(request.getIlacAdi());
        h.setDozaj(request.getDozaj());
        h.setSureGun(request.getSureGun());
        h.setVeterinerId(request.getVeterinerId());
        h.setAciklama(request.getAciklama());
        return toDto(repo.save(h));
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<HastalikResponse> getAll() {
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public HastalikResponse getById(Long id) {
        return toDto(repo.findById(id).orElseThrow());
    }
}
