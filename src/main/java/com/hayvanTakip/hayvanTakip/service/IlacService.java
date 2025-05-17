package com.hayvanTakip.hayvanTakip.service;

import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.IlacRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.IlacResponse;

public interface IlacService {
    IlacResponse create(IlacRequest request);
    IlacResponse update(Long id, IlacRequest request);
    void delete(Long id);
    List<IlacResponse> getAll();
    IlacResponse getById(Long id);
}
