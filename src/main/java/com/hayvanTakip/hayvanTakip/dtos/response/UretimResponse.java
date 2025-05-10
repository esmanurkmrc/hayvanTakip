package com.hayvanTakip.hayvanTakip.dtos.response;

import java.time.LocalDate;

public class UretimResponse {

    private Long id;
    private LocalDate tarih;
    private Integer miktar;
    private Long hayvanId; 

    public UretimResponse(Long id, LocalDate tarih, Integer miktar, Long hayvanId) {
        this.id = id;
        this.tarih = tarih;
        this.miktar = miktar;
        this.hayvanId = hayvanId;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public Integer getMiktar() {
        return miktar;
    }

    public void setMiktar(Integer miktar) {
        this.miktar = miktar;
    }

    public Long getHayvanId() {
        return hayvanId;
    }

    public void setHayvanId(Long hayvanId) {
        this.hayvanId = hayvanId;
    }
}
