package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.VeterinerRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.VeterinerResponse;

import java.util.List;

public interface VeterinerService {
    VeterinerResponse create(VeterinerRequest request);
    VeterinerResponse update(Long id, VeterinerRequest request);
    void delete(Long id);
    List<VeterinerResponse> getAll();
    VeterinerResponse getById(Long id);
}
