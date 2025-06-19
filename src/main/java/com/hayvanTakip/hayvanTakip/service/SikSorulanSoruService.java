package com.hayvanTakip.hayvanTakip.service;


import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.SikSoruRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.SikSoruResponse;

public interface SikSorulanSoruService {
    SikSoruResponse ekle(SikSoruRequest request);
    List<SikSoruResponse> listele();
    SikSoruResponse guncelle(Long id, SikSoruRequest request);
    void sil(Long id);
}
