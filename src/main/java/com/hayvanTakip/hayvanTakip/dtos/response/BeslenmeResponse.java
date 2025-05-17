package com.hayvanTakip.hayvanTakip.dtos.response;

import java.time.LocalDate;

public class BeslenmeResponse {
    private Long id;
    private Long hayvanId;
    private String yemAdi;
    private double miktarKg;
    private LocalDate tarih;
    private String notlar;
    private Long veterinerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHayvanId() {
        return hayvanId;
    }

    public void setHayvanId(Long hayvanId) {
        this.hayvanId = hayvanId;
    }

    public String getYemAdi() {
        return yemAdi;
    }

    public void setYemAdi(String yemAdi) {
        this.yemAdi = yemAdi;
    }

    public double getMiktarKg() {
        return miktarKg;
    }

    public void setMiktarKg(double miktarKg) {
        this.miktarKg = miktarKg;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public String getNotlar() {
        return notlar;
    }

    public void setNotlar(String notlar) {
        this.notlar = notlar;
    }

    public Long getVeterinerId() {
        return veterinerId;
    }

    public void setVeterinerId(Long veterinerId) {
        this.veterinerId = veterinerId;
    }
}
