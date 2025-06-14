package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.response.HastalikBelirtiResponse;
import com.hayvanTakip.hayvanTakip.models.Belirti;
import com.hayvanTakip.hayvanTakip.models.Hastalik;
import com.hayvanTakip.hayvanTakip.models.HastalikBelirti;
import com.hayvanTakip.hayvanTakip.repositories.BelirtiRepository;
import com.hayvanTakip.hayvanTakip.repositories.HastalikBelirtiRepository;
import com.hayvanTakip.hayvanTakip.repositories.HastalikRepository;
import com.hayvanTakip.hayvanTakip.service.HastalikBelirtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class HastalikBelirtiServiceImpl implements HastalikBelirtiService {

    @Autowired
    private HastalikBelirtiRepository hastalikBelirtiRepository;

    @Autowired
    private HastalikRepository hastalikRepository;

    @Autowired
    private BelirtiRepository belirtiRepository;

    @Override
    public List<HastalikBelirtiResponse> getAllWithNames() {
        List<HastalikBelirti> entities = hastalikBelirtiRepository.findAll();

        return entities.stream().map(e -> {
            Optional<Hastalik> hastalik = hastalikRepository.findById(e.getHastalikId());
            Optional<Belirti> belirti = belirtiRepository.findById(e.getBelirtiId());

            return new HastalikBelirtiResponse(
                    e.getId(),
                    e.getHastalikId(),
                    hastalik.map(Hastalik::getHastalikAdi).orElse(""),
                    e.getBelirtiId(),
                    belirti.map(Belirti::getBelirtiAdi).orElse("")
            );
        }).collect(Collectors.toList());
    }

    @Override
    public List<Object[]> getGrafikVerisi() {
        List<Object[]> rawData = hastalikBelirtiRepository.getBelirtiSayilariByHastalik();
        return rawData;
    }

    @Override
    public void create(HastalikBelirtiResponse request) {
        HastalikBelirti yeni = new HastalikBelirti();
        yeni.setHastalikId(request.getHastalikId());
        yeni.setBelirtiId(request.getBelirtiId());
        hastalikBelirtiRepository.save(yeni);
    }

    @Override
    public void delete(Long id) {
        hastalikBelirtiRepository.deleteById(id);
    }

    @Override
    public List<Hastalik> onerilenHastaliklariGetir(List<Long> belirtiIdList) {
        List<HastalikBelirti> eslesmeler = hastalikBelirtiRepository.findAll();
        Map<Long, Long> sayac = new HashMap<>();

        for (HastalikBelirti hb : eslesmeler) {
            if (belirtiIdList.contains(hb.getBelirtiId())) {
                sayac.put(hb.getHastalikId(), sayac.getOrDefault(hb.getHastalikId(), 0L) + 1);
            }
        }

        List<Long> enCokEslesenHastalikIdler = sayac.entrySet().stream()
            .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
            .limit(3)
            .map(Map.Entry::getKey)
            .toList();

        return hastalikRepository.findAllById(enCokEslesenHastalikIdler);
    }
}
