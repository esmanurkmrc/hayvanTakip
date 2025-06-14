package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Yapilacak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String baslik;
    private String aciklama;
    private String onemDerecesi; 
    private Boolean tamamlandi = false;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getOnemDerecesi() {
        return onemDerecesi;
    }

    public void setOnemDerecesi(String onemDerecesi) {
        this.onemDerecesi = onemDerecesi;
    }

    public Boolean getTamamlandi() {
        return tamamlandi;
    }

    public Boolean isTamamlandi() {
        return tamamlandi;
    }

    public void setTamamlandi(Boolean tamamlandi) {
        this.tamamlandi = tamamlandi;
    }
}
