package com.hayvanTakip.hayvanTakip.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hayvan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kupeNo;
    private String yasamAlani;
    private String irk;
    private LocalDate dogumTarihi;
    private String cinsiyet;
    private LocalDate olumTarihi;

    
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) {
         this.id = id; }

    public String getKupeNo() { 
        return kupeNo; }
    public void setKupeNo(String kupeNo) { 
        this.kupeNo = kupeNo; 
    }

    public String getYasamAlani() { 
        return yasamAlani; 
    }
    public void setYasamAlani(String yasamAlani) {
         this.yasamAlani = yasamAlani; 
        }

    public String getIrk() {
         return irk; }
    public void setIrk(String irk) { 
        this.irk = irk; 
    }

    public LocalDate getDogumTarihi() { 
        return dogumTarihi; }
    public void setDogumTarihi(LocalDate dogumTarihi) {
         this.dogumTarihi = dogumTarihi; 
        }

    public String getCinsiyet() {
         return cinsiyet; }
    public void setCinsiyet(String cinsiyet) {
         this.cinsiyet = cinsiyet; 
        }

    public LocalDate getOlumTarihi() { 
        return olumTarihi; 
    }
    public void setOlumTarihi(LocalDate olumTarihi) {
         this.olumTarihi = olumTarihi; 
        }
}
