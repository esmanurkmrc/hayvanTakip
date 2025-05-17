package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.IlacRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.IlacResponse;
import com.hayvanTakip.hayvanTakip.models.Ilac;
import com.hayvanTakip.hayvanTakip.repositories.IlacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IlacServiceImpl implements IlacService {

    @Autowired
    private IlacRepository ilacRepository;

    private IlacResponse mapToResponse(Ilac ilac) {
        IlacResponse response = new IlacResponse();
        response.setId(ilac.getId());
        response.setIlacAdi(ilac.getIlacAdi());
        response.setIlacTuru(ilac.getIlacTuru());
        response.setKullanimAmaci(ilac.getKullanimAmaci());
        return response;
    }

    @Override
    public IlacResponse create(IlacRequest request) {
        Ilac ilac = new Ilac();
        ilac.setIlacAdi(request.getIlacAdi());
        ilac.setIlacTuru(request.getIlacTuru());
        ilac.setKullanimAmaci(request.getKullanimAmaci());
        return mapToResponse(ilacRepository.save(ilac));
    }

    @Override
    public IlacResponse update(Long id, IlacRequest request) {
        Ilac ilac = ilacRepository.findById(id).orElseThrow(() -> new RuntimeException("İlaç bulunamadı."));
        ilac.setIlacAdi(request.getIlacAdi());
        ilac.setIlacTuru(request.getIlacTuru());
        ilac.setKullanimAmaci(request.getKullanimAmaci());
        return mapToResponse(ilacRepository.save(ilac));
    }

    @Override
    public void delete(Long id) {
        ilacRepository.deleteById(id);
    }

    @Override
    public List<IlacResponse> getAll() {
        return ilacRepository.findAll().stream().map(this::mapToResponse).collect(Collectors.toList());
    }

    @Override
    public IlacResponse getById(Long id) {
        Ilac ilac = ilacRepository.findById(id).orElseThrow(() -> new RuntimeException("İlaç bulunamadı."));
        return mapToResponse(ilac);
    }
}
