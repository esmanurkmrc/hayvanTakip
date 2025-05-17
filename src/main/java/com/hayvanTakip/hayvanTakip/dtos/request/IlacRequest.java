package com.hayvanTakip.hayvanTakip.dtos.request;

public class IlacRequest {
    private String ilacAdi;
    private String ilacTuru;
    private String kullanimAmaci;

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
