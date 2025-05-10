package com.hayvanTakip.hayvanTakip.strategy;

import java.util.List;

import com.hayvanTakip.hayvanTakip.dtos.request.UretimRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.UretimResponse;

public interface UretimStrategy {
    void kaydet(UretimRequest request);
    List<UretimResponse> listele();
}

