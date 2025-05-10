package com.hayvanTakip.hayvanTakip.service;
import com.hayvanTakip.hayvanTakip.dtos.request.RandevuRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.RandevuResponse;

import java.util.List;

public interface RandevuService {
    RandevuResponse create(RandevuRequest request);
    RandevuResponse update(Long id, RandevuRequest request);
    void delete(Long id);
    List<RandevuResponse> getAll();
    RandevuResponse getById(Long id);
}
