package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import com.hayvanTakip.hayvanTakip.dtos.response.AsiTakvimiResponse;

import java.util.List;

public interface AsiTakvimiService {
    AsiTakvimi create(AsiTakvimi asi);
    AsiTakvimi update(Long id, AsiTakvimi asi);
    void delete(Long id);
    List<AsiTakvimi> getAll();
    AsiTakvimi getById(Long id);
    List<AsiTakvimiResponse> getAllAsiTakvimi();
}
