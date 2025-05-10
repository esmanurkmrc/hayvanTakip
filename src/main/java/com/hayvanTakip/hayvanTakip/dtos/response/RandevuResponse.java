package com.hayvanTakip.hayvanTakip.dtos.response;

import java.time.LocalDate;
import java.time.LocalTime;

public class RandevuResponse {

    private Long id;
    private Long veterinerId;
    private String veterinerAd; 

    private String konum;
    private Long hayvanId;
    private LocalDate tarih;
    private LocalTime saat;
    private String aciklama;
    private String durum;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVeterinerId() {
        return veterinerId;
    }

    public void setVeterinerId(Long veterinerId) {
        this.veterinerId = veterinerId;
    }

    public String getVeterinerAd() {
        return veterinerAd;
    }

    public void setVeterinerAd(String veterinerAd) {
        this.veterinerAd = veterinerAd;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public Long getHayvanId() {
        return hayvanId;
    }

    public void setHayvanId(Long hayvanId) {
        this.hayvanId = hayvanId;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public LocalTime getSaat() {
        return saat;
    }

    public void setSaat(LocalTime saat) {
        this.saat = saat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
