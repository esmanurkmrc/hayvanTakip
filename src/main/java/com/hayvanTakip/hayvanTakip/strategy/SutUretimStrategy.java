package com.hayvanTakip.hayvanTakip.strategy;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.UretimRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.UretimResponse;
import com.hayvanTakip.hayvanTakip.models.SutUretimi;
import com.hayvanTakip.hayvanTakip.repositories.SutUretimiRepository;

@Service("sut")
public class SutUretimStrategy implements UretimStrategy {

    @Autowired
    private SutUretimiRepository sutRepo;

    @Override
    public void kaydet(UretimRequest request) {
        SutUretimi sut = new SutUretimi();
        sut.setMiktar(request.getMiktar());
        sut.setTarih(request.getTarih());
        sut.setHayvanId(request.getHayvanId());
        sutRepo.save(sut);
    }

    @Override
    public List<UretimResponse> listele() {
        return sutRepo.findAll().stream().map(sut -> new UretimResponse(
                sut.getId(), sut.getTarih(), sut.getMiktar(), sut.getHayvanId()
        )).collect(Collectors.toList());
    }
}
