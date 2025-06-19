package com.hayvanTakip.hayvanTakip.factory;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.hayvanTakip.hayvanTakip.dtos.request.SikSoruRequest;
import com.hayvanTakip.hayvanTakip.models.SikSorulanSoru;

@Component
public class SikSoruFactory {

    public SikSorulanSoru createSoru(SikSoruRequest request) {
        SikSorulanSoru soru = new SikSorulanSoru();
        soru.setSoru(request.getSoru());
        soru.setCevap(request.getCevap());
        soru.setKategori(request.getKategori());
        soru.setEklenmeTarihi(LocalDateTime.now());
        return soru;
    }
}
