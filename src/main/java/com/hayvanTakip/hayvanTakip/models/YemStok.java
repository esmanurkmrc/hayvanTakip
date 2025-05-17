package com.hayvanTakip.hayvanTakip.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "yem_stok")
public class YemStok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String yemAdi;              
    private String yemTuru;              
    private double miktarKg;             
    private LocalDate girisTarihi;       
    private LocalDate cikisTarihi;       
    private String birimFiyat;           

    private String aciklama;             

   
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) {
         this.id = id; 
        }

    public String getYemAdi() { 
        return yemAdi; 
    }
    public void setYemAdi(String yemAdi) {
         this.yemAdi = yemAdi; 
        }

    public String getYemTuru() {
         return yemTuru; }
    public void setYemTuru(String yemTuru) {
         this.yemTuru = yemTuru;
         }

    public double getMiktarKg() {
         return miktarKg; }
    public void setMiktarKg(double miktarKg) {
         this.miktarKg = miktarKg; }

    public LocalDate getGirisTarihi() {
         return girisTarihi; 
        }
    public void setGirisTarihi(LocalDate girisTarihi) {
         this.girisTarihi = girisTarihi; 
        }

    public LocalDate getCikisTarihi() { 
        return cikisTarihi; 
    }
    public void setCikisTarihi(LocalDate cikisTarihi) {
         this.cikisTarihi = cikisTarihi;
        }

    public String getBirimFiyat() { 
        return birimFiyat;
     }
    public void setBirimFiyat(String birimFiyat) {
         this.birimFiyat = birimFiyat; 
        }

    public String getAciklama() { 
        return aciklama; 
    }
    public void setAciklama(String aciklama) {
         this.aciklama = aciklama;
         }
}
