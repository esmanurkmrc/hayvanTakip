package com.hayvanTakip.hayvanTakip.dtos.request;

import java.time.LocalDateTime;

public class SikSoruRequest {

    private Long id;
    private String soru;
    private String cevap;
    private String kategori;
    private LocalDateTime eklenmeTarihi;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public LocalDateTime getEklenmeTarihi() {
        return eklenmeTarihi;
    }

    public void setEklenmeTarihi(LocalDateTime eklenmeTarihi) {
        this.eklenmeTarihi = eklenmeTarihi;
    }
}
