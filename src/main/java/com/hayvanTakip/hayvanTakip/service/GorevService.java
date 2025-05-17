package com.hayvanTakip.hayvanTakip.service;

import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.GorevRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.GorevResponse;

public interface GorevService {
    GorevResponse create(GorevRequest request);
    GorevResponse update(Long id, GorevRequest request);
    void delete(Long id);
    GorevResponse getById(Long id);
    List<GorevResponse> getAll();
    List<GorevResponse> getByVeterinerId(Long veterinerId);
}
