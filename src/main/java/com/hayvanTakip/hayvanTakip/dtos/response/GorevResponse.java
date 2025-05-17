package com.hayvanTakip.hayvanTakip.dtos.response;

import java.time.LocalDate;
import java.time.LocalTime;

public class GorevResponse {

    private Long id;
    private Long veterinerId;
    private String gorevAdi;
    private String aciklama;
    private LocalDate tarih;
    private LocalTime saat;
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

    public String getGorevAdi() {
        return gorevAdi;
    }

    public void setGorevAdi(String gorevAdi) {
        this.gorevAdi = gorevAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
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

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}