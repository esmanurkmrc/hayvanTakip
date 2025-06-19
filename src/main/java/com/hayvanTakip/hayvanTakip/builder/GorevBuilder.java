package com.hayvanTakip.hayvanTakip.builder;

import com.hayvanTakip.hayvanTakip.dtos.request.GorevRequest;
import com.hayvanTakip.hayvanTakip.models.Gorev;

public class GorevBuilder {

    private final Gorev gorev;

    public GorevBuilder() {
        this.gorev = new Gorev();
    }

    public GorevBuilder fromRequest(GorevRequest request) {
        gorev.setVeterinerId(request.getVeterinerId());
        gorev.setGorevAdi(request.getGorevAdi());
        gorev.setAciklama(request.getAciklama());
        gorev.setTarih(request.getTarih());
        gorev.setSaat(request.getSaat());
        gorev.setDurum(request.getDurum());
        return this;
    }

    public Gorev build() {
        return gorev;
    }
}

// [Design Pattern: Builder]
// Bu sınıf, görev atamalarını adım adım oluşturmak için Builder Pattern uygulanarak tasarlanmıştır.

