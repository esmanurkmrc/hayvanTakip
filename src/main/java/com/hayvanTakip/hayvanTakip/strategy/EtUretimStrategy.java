package com.hayvanTakip.hayvanTakip.strategy;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayvanTakip.hayvanTakip.dtos.request.UretimRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.UretimResponse;
import com.hayvanTakip.hayvanTakip.models.EtUretimi;
import com.hayvanTakip.hayvanTakip.repositories.EtUretimiRepository;

@Service("et")
public class EtUretimStrategy implements UretimStrategy {

    @Autowired
    private EtUretimiRepository etRepo;

    @Override
    public void kaydet(UretimRequest request) {
        EtUretimi et = new EtUretimi();
        et.setMiktar(request.getMiktar());
        et.setTarih(request.getTarih());
        etRepo.save(et);
    }

    @Override
    public List<UretimResponse> listele() {
        return etRepo.findAll().stream().map(et -> new UretimResponse(
                et.getId(), et.getTarih(), et.getMiktar(), null
        )).collect(Collectors.toList());
    }
}
