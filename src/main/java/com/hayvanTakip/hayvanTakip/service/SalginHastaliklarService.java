package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.SalginHastalikRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.SalginHastalikResponse;

import java.util.List;

public interface SalginHastaliklarService {
    SalginHastalikResponse create(SalginHastalikRequest request);
    SalginHastalikResponse update(Long id, SalginHastalikRequest request);
    void delete(Long id);
    List<SalginHastalikResponse> getAll();
    SalginHastalikResponse getById(Long id);
}
