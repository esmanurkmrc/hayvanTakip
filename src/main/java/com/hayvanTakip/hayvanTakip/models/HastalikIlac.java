package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hastalik_ilac")
public class HastalikIlac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long hastalikId;
    private Long ilacId;

    private String aciklama;
    private String doz;

    private String hastalikAdi;

    private String ilacAdi;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHastalikId() {
        return hastalikId;
    }

    public void setHastalikId(Long hastalikId) {
        this.hastalikId = hastalikId;
    }

    public Long getIlacId() {
        return ilacId;
    }

    public void setIlacId(Long ilacId) {
        this.ilacId = ilacId;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDoz() {
        return doz;
    }

    public void setDoz(String doz) {
        this.doz = doz;
    }

    public String getHastalikAdi() {
        return hastalikAdi;
    }

    public void setHastalikAdi(String hastalikAdi) {
        this.hastalikAdi = hastalikAdi;
    }

    public String getIlacAdi() {
        return ilacAdi;
    }

    public void setIlacAdi(String ilacAdi) {
        this.ilacAdi = ilacAdi;
    }
}
