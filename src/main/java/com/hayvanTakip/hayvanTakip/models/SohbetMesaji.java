package com.hayvanTakip.hayvanTakip.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sohbet_mesajlari")

public class SohbetMesaji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long gonderenId;
    private Long aliciId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String mesaj;

    private LocalDateTime zaman = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGonderenId() {
        return gonderenId;
    }

    public void setGonderenId(Long gonderenId) {
        this.gonderenId = gonderenId;
    }

    public Long getAliciId() {
        return aliciId;
    }

    public void setAliciId(Long aliciId) {
        this.aliciId = aliciId;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public LocalDateTime getZaman() {
        return zaman;
    }

    public void setZaman(LocalDateTime zaman) {
        this.zaman = zaman;
    }
}
