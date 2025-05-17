package com.hayvanTakip.hayvanTakip.service;

import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.VeterinerRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.VeterinerResponse;
import com.hayvanTakip.hayvanTakip.models.Veteriner;

public interface VeterinerService {
    VeterinerResponse create(VeterinerRequest request);
    VeterinerResponse update(Long id, VeterinerRequest request);
    void delete(Long id);
    List<VeterinerResponse> getAll();
    VeterinerResponse getById(Long id);

    VeterinerResponse convertToResponse(Veteriner v);
}
