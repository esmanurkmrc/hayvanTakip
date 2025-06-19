package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.HayvancilikBilgiRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HayvancilikBilgiResponse;

import java.util.List;

public interface HayvancilikBilgiService {

    HayvancilikBilgiResponse create(HayvancilikBilgiRequest request);

    HayvancilikBilgiResponse update(Long id, HayvancilikBilgiRequest request);

    void delete(Long id);

    HayvancilikBilgiResponse getById(Long id);

    List<HayvancilikBilgiResponse> getAll();

    List<HayvancilikBilgiResponse> getByKategori(String kategori);

    List<HayvancilikBilgiResponse> searchByBaslik(String baslik);
}
