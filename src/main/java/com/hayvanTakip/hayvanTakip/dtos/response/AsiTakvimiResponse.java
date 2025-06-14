package com.hayvanTakip.hayvanTakip.dtos.response;

public class AsiTakvimiResponse {
    private Long id;
    private Long hayvanId;
    private String uygulamaTarihi;
    private String veterinerAdi;  
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

    public String getUygulamaTarihi() {
        return uygulamaTarihi;
    }

    public void setUygulamaTarihi(String uygulamaTarihi) {
        this.uygulamaTarihi = uygulamaTarihi;
    }

    public String getVeterinerAdi() {
        return veterinerAdi;
    }

    public void setVeterinerAdi(String veterinerAdi) {
        this.veterinerAdi = veterinerAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
