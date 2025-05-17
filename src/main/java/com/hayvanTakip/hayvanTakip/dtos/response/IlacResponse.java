package com.hayvanTakip.hayvanTakip.dtos.response;

public class IlacResponse {
    private Long id;
    private String ilacAdi;
    private String ilacTuru;
    private String kullanimAmaci;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIlacAdi() {
        return ilacAdi;
    }

    public void setIlacAdi(String ilacAdi) {
        this.ilacAdi = ilacAdi;
    }

    public String getIlacTuru() {
        return ilacTuru;
    }

    public void setIlacTuru(String ilacTuru) {
        this.ilacTuru = ilacTuru;
    }

    public String getKullanimAmaci() {
        return kullanimAmaci;
    }

    public void setKullanimAmaci(String kullanimAmaci) {
        this.kullanimAmaci = kullanimAmaci;
    }
}
