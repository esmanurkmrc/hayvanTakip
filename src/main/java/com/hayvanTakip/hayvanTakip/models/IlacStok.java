package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ilac_stok")
public class IlacStok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ilacId;

    private int miktar;

    private double birimFiyat;

    private String aciklama;

    private LocalDate girisTarihi;

    private LocalDate sonKullanmaTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIlacId() {
        return ilacId;
    }

    public void setIlacId(Long ilacId) {
        this.ilacId = ilacId;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public LocalDate getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(LocalDate girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public LocalDate getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }
}
