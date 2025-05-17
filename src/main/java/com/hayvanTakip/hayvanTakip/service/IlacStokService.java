package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.IlacStokRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.IlacStokResponse;

import java.util.List;

public interface IlacStokService {
    IlacStokResponse create(IlacStokRequest request);
    IlacStokResponse update(Long id, IlacStokRequest request);
    void delete(Long id);
    IlacStokResponse getById(Long id);
    List<IlacStokResponse> getAll();
    List<IlacStokResponse> getByIlacId(Long ilacId);
}
