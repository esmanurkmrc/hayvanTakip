package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HayvanRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HayvanResponse;
import com.hayvanTakip.hayvanTakip.models.Hayvan;
import com.hayvanTakip.hayvanTakip.repositories.HayvanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HayvanServiceImpl implements HayvanService {

    @Autowired
    private HayvanRepository hayvanRepository;

    @Override
    public HayvanResponse create(HayvanRequest request) {
        Hayvan hayvan = mapToEntity(request);
        return mapToResponse(hayvanRepository.save(hayvan));
    }

    @Override
    public HayvanResponse update(Long id, HayvanRequest request) {
        Hayvan hayvan = hayvanRepository.findById(id).orElseThrow();
        hayvan.setKupeNo(request.getKupeNo());
        hayvan.setYasamAlani(request.getYasamAlani());
        hayvan.setIrk(request.getIrk());
        hayvan.setDogumTarihi(request.getDogumTarihi());
        hayvan.setCinsiyet(request.getCinsiyet());
        hayvan.setOlumTarihi(request.getOlumTarihi());
        return mapToResponse(hayvanRepository.save(hayvan));
    }

    @Override
    public void delete(Long id) {
        hayvanRepository.deleteById(id);
    }

    @Override
    public List<HayvanResponse> getAll() {
        return hayvanRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public HayvanResponse getById(Long id) {
        Hayvan hayvan = hayvanRepository.findById(id).orElseThrow();
        return mapToResponse(hayvan);
    }

    private Hayvan mapToEntity(HayvanRequest request) {
        Hayvan hayvan = new Hayvan();
        hayvan.setKupeNo(request.getKupeNo());
        hayvan.setYasamAlani(request.getYasamAlani());
        hayvan.setIrk(request.getIrk());
        hayvan.setDogumTarihi(request.getDogumTarihi());
        hayvan.setCinsiyet(request.getCinsiyet());
        hayvan.setOlumTarihi(request.getOlumTarihi());
        return hayvan;
    }

    private HayvanResponse mapToResponse(Hayvan hayvan) {
        HayvanResponse response = new HayvanResponse();
        response.setId(hayvan.getId());
        response.setKupeNo(hayvan.getKupeNo());
        response.setYasamAlani(hayvan.getYasamAlani());
        response.setIrk(hayvan.getIrk());
        response.setDogumTarihi(hayvan.getDogumTarihi());
        response.setCinsiyet(hayvan.getCinsiyet());
        response.setOlumTarihi(hayvan.getOlumTarihi());
        return response;
    }
}
