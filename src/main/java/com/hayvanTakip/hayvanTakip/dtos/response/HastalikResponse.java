package com.hayvanTakip.hayvanTakip.dtos.response;

import java.time.LocalDate;

public class HastalikResponse {

    private Long id;
    private Long hayvanId;
    private String hastalikAdi;
    private String belirtiler;
    private LocalDate taniTarihi;
    private String tedavi;
    private String ilacAdi;
    private String dozaj;
    private Integer sureGun;
    private Long veterinerId;
    private String aciklama;

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

    public String getHastalikAdi() {
        return hastalikAdi;
    }

    public void setHastalikAdi(String hastalikAdi) {
        this.hastalikAdi = hastalikAdi;
    }

    public String getBelirtiler() {
        return belirtiler;
    }

    public void setBelirtiler(String belirtiler) {
        this.belirtiler = belirtiler;
    }

    public LocalDate getTaniTarihi() {
        return taniTarihi;
    }

    public void setTaniTarihi(LocalDate taniTarihi) {
        this.taniTarihi = taniTarihi;
    }

    public String getTedavi() {
        return tedavi;
    }

    public void setTedavi(String tedavi) {
        this.tedavi = tedavi;
    }

    public String getIlacAdi() {
        return ilacAdi;
    }

    public void setIlacAdi(String ilacAdi) {
        this.ilacAdi = ilacAdi;
    }

    public String getDozaj() {
        return dozaj;
    }

    public void setDozaj(String dozaj) {
        this.dozaj = dozaj;
    }

    public Integer getSureGun() {
        return sureGun;
    }

    public void setSureGun(Integer sureGun) {
        this.sureGun = sureGun;
    }

    public Long getVeterinerId() {
        return veterinerId;
    }

    public void setVeterinerId(Long veterinerId) {
        this.veterinerId = veterinerId;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
