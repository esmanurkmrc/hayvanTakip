package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.*;

@Entity
@Table(name = "salgin_hastaliklar")
public class SalginHastaliklar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String belirtiler;
    private String yayilmaDurumu;
    private String korunmaYontemleri;
    private String etkiledigiTurler;
    private String aciklama;
    private String konum; 



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBelirtiler() {
        return belirtiler;
    }

    public void setBelirtiler(String belirtiler) {
        this.belirtiler = belirtiler;
    }

    public String getYayilmaDurumu() {
        return yayilmaDurumu;
    }

    public void setYayilmaDurumu(String yayilmaDurumu) {
        this.yayilmaDurumu = yayilmaDurumu;
    }

    public String getKorunmaYontemleri() {
        return korunmaYontemleri;
    }

    public void setKorunmaYontemleri(String korunmaYontemleri) {
        this.korunmaYontemleri = korunmaYontemleri;
    }

    public String getEtkiledigiTurler() {
        return etkiledigiTurler;
    }

    public void setEtkiledigiTurler(String etkiledigiTurler) {
        this.etkiledigiTurler = etkiledigiTurler;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }
}
