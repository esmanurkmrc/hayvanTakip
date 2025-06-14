package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Belirti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String belirtiAdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBelirtiAdi() {
        return belirtiAdi;
    }

    public void setBelirtiAdi(String belirtiAdi) {
        this.belirtiAdi = belirtiAdi;
    }
}
