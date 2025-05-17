package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HastalikIlacRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HastalikIlacResponse;
import com.hayvanTakip.hayvanTakip.models.HastalikIlac;
import com.hayvanTakip.hayvanTakip.models.Hastalik;
import com.hayvanTakip.hayvanTakip.models.Ilac;
import com.hayvanTakip.hayvanTakip.repositories.HastalikIlacRepository;
import com.hayvanTakip.hayvanTakip.repositories.HastalikRepository;
import com.hayvanTakip.hayvanTakip.repositories.IlacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HastalikIlacServiceImpl implements HastalikIlacService {

    @Autowired
    private HastalikIlacRepository repository;

    @Autowired
    private IlacRepository ilacRepository;

    @Autowired
    private HastalikRepository hastalikRepository;

    @Override
    public HastalikIlacResponse create(HastalikIlacRequest request) {
        Long ilacId = request.getIlacId();
        Long hastalikId = request.getHastalikId();

        Ilac ilac = ilacRepository.findById(ilacId)
                .orElseThrow(() -> new RuntimeException("İlaç ID bulunamadı: " + ilacId));
        Hastalik hastalik = hastalikRepository.findById(hastalikId)
                .orElseThrow(() -> new RuntimeException("Hastalık ID bulunamadı: " + hastalikId));

        HastalikIlac entity = new HastalikIlac();
        entity.setIlacId(ilacId);
        entity.setHastalikId(hastalikId);
        entity.setIlacAdi(ilac.getIlacAdi());
        entity.setHastalikAdi(hastalik.getHastalikAdi());
        entity.setDoz(request.getDoz());
        entity.setAciklama(request.getAciklama());

        return mapToResponse(repository.save(entity));
    }

    @Override
    public HastalikIlacResponse update(Long id, HastalikIlacRequest request) {
        HastalikIlac existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kayıt bulunamadı"));

        Long ilacId = request.getIlacId();
        Long hastalikId = request.getHastalikId();

        Ilac ilac = ilacRepository.findById(ilacId)
                .orElseThrow(() -> new RuntimeException("İlaç ID bulunamadı: " + ilacId));
        Hastalik hastalik = hastalikRepository.findById(hastalikId)
                .orElseThrow(() -> new RuntimeException("Hastalık ID bulunamadı: " + hastalikId));

        existing.setIlacId(ilacId);
        existing.setHastalikId(hastalikId);
        existing.setIlacAdi(ilac.getIlacAdi());
        existing.setHastalikAdi(hastalik.getHastalikAdi());
        existing.setDoz(request.getDoz());
        existing.setAciklama(request.getAciklama());

        return mapToResponse(repository.save(existing));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<HastalikIlacResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public HastalikIlacResponse getById(Long id) {
        return repository.findById(id)
                .map(this::mapToResponse)
                .orElseThrow(() -> new RuntimeException("Kayıt bulunamadı"));
    }

    private HastalikIlacResponse mapToResponse(HastalikIlac entity) {
        HastalikIlacResponse response = new HastalikIlacResponse();
        response.setId(entity.getId());
        response.setHastalikId(entity.getHastalikId());
        response.setIlacId(entity.getIlacId());
        response.setAciklama(entity.getAciklama());
        response.setDoz(entity.getDoz());
        response.setHastalikAdi(entity.getHastalikAdi());
        response.setIlacAdi(entity.getIlacAdi());
        return response;
    }
}
