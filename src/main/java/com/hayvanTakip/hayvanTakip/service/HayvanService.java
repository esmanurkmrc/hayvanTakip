package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HayvanRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HayvanResponse;

import java.util.List;

public interface HayvanService {
    HayvanResponse create(HayvanRequest request);
    HayvanResponse update(Long id, HayvanRequest request);
    void delete(Long id);
    List<HayvanResponse> getAll();
    HayvanResponse getById(Long id);
}
