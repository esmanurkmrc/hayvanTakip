package com.hayvanTakip.hayvanTakip.dtos.request;

import java.time.LocalDate;

public class UretimRequest {

    private Integer miktar;
    private LocalDate tarih;
    private Long hayvanId; 

   
    public Integer getMiktar() {
        return miktar;
    }

    public void setMiktar(Integer miktar) {
        this.miktar = miktar;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public Long getHayvanId() {
        return hayvanId;
    }

    public void setHayvanId(Long hayvanId) {
        this.hayvanId = hayvanId;
    }
}
