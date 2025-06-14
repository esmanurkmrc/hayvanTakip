package com.hayvanTakip.hayvanTakip.service;

import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.response.HastalikBelirtiResponse;
import com.hayvanTakip.hayvanTakip.models.Hastalik;

public interface HastalikBelirtiService {
    List<HastalikBelirtiResponse> getAllWithNames();
    List<Object[]> getGrafikVerisi();
    void create(HastalikBelirtiResponse request);
    void delete(Long id);
    List<Hastalik> onerilenHastaliklariGetir(List<Long> belirtiIdList);
}
