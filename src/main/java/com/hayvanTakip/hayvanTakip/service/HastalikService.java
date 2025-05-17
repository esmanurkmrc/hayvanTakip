package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HastalikRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HastalikResponse;

import java.util.List;

public interface HastalikService {
    HastalikResponse create(HastalikRequest request);
    HastalikResponse update(Long id, HastalikRequest request);
    void delete(Long id);
    List<HastalikResponse> getAll();
    HastalikResponse getById(Long id);
}
