package com.hayvanTakip.hayvanTakip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.RandevuRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.RandevuResponse;
import com.hayvanTakip.hayvanTakip.models.Randevu;
import com.hayvanTakip.hayvanTakip.repositories.RandevuRepository;
import com.hayvanTakip.hayvanTakip.repositories.VeterinerRepository;

@Service
public class RandevuServiceImpl implements RandevuService {

    @Autowired
    private RandevuRepository randevuRepository;

    @Autowired
    private VeterinerRepository veterinerRepository;

    private RandevuResponse toDto(Randevu r) {
        RandevuResponse dto = new RandevuResponse();
        dto.setId(r.getId());
        dto.setVeterinerId(r.getVeterinerId());
        dto.setKonum(r.getKonum());
        dto.setHayvanId(r.getHayvanId());
        dto.setTarih(r.getTarih());
        dto.setSaat(r.getSaat());
        dto.setAciklama(r.getAciklama());
        dto.setDurum(r.getDurum());

        
        veterinerRepository.findById(r.getVeterinerId()).ifPresent(v -> {
            dto.setVeterinerAd(v.getAd() + " " + v.getSoyad());
        });

        return dto;
    }

    private Randevu toEntity(RandevuRequest req) {
        Randevu r = new Randevu();
        r.setVeterinerId(req.getVeterinerId());
        r.setKonum(req.getKonum());
        r.setHayvanId(req.getHayvanId());
        r.setTarih(req.getTarih());
        r.setSaat(req.getSaat());
        r.setAciklama(req.getAciklama());
        r.setDurum(req.getDurum());
        return r;
    }

    @Override
    public RandevuResponse create(RandevuRequest request) {
        Randevu saved = randevuRepository.save(toEntity(request));
        return toDto(saved);
    }

    @Override
    public RandevuResponse update(Long id, RandevuRequest request) {
        Randevu existing = randevuRepository.findById(id).orElseThrow(() -> new RuntimeException("Randevu bulunamadı"));
        existing.setVeterinerId(request.getVeterinerId());
        existing.setKonum(request.getKonum());
        existing.setHayvanId(request.getHayvanId());
        existing.setTarih(request.getTarih());
        existing.setSaat(request.getSaat());
        existing.setAciklama(request.getAciklama());
        existing.setDurum(request.getDurum());
        return toDto(randevuRepository.save(existing));
    }

    @Override
    public void delete(Long id) {
        randevuRepository.deleteById(id);
    }

    @Override
    public List<RandevuResponse> getAll() {
        return randevuRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public RandevuResponse getById(Long id) {
        return toDto(randevuRepository.findById(id).orElseThrow(() -> new RuntimeException("Randevu bulunamadı")));
    }
}
