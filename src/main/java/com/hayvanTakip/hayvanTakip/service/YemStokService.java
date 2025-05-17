package com.hayvanTakip.hayvanTakip.service;


import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.YemStokRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.YemStokResponse;

public interface YemStokService {
    YemStokResponse create(YemStokRequest request);
    YemStokResponse update(Long id, YemStokRequest request);
    void delete(Long id);
    YemStokResponse getById(Long id);
    List<YemStokResponse> getAll();
}
