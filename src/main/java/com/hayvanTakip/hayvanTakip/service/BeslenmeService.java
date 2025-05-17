package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.BeslenmeRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.BeslenmeResponse;

import java.util.List;

public interface BeslenmeService {
    BeslenmeResponse create(BeslenmeRequest request);
    BeslenmeResponse update(Long id, BeslenmeRequest request);
    void delete(Long id);
    List<BeslenmeResponse> getAll();
}
