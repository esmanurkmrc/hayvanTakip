package com.hayvanTakip.hayvanTakip.service;

import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.HastalikIlacRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HastalikIlacResponse;

public interface HastalikIlacService {
    HastalikIlacResponse create(HastalikIlacRequest request);
    HastalikIlacResponse update(Long id, HastalikIlacRequest request);
    void delete(Long id);
    List<HastalikIlacResponse> getAll();
    HastalikIlacResponse getById(Long id);
    List<HastalikIlacResponse> getByHastalikId(Long hastalikId);

}
