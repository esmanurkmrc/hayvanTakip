package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "iklim_verisi")
public class IklimVerisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double sicaklik;
    private Double nem;
    private Double ruzgarHizi;
    private Double yagisMiktari;
    private LocalDateTime olcumTarihi;

    @ManyToOne(optional = true)
    @JoinColumn(name = "barinak_id", nullable = true)
    private Barinak barinak;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(Double sicaklik) {
        this.sicaklik = sicaklik;
    }

    public Double getNem() {
        return nem;
    }

    public void setNem(Double nem) {
        this.nem = nem;
    }

    public Double getRuzgarHizi() {
        return ruzgarHizi;
    }

    public void setRuzgarHizi(Double ruzgarHizi) {
        this.ruzgarHizi = ruzgarHizi;
    }

    public Double getYagisMiktari() {
        return yagisMiktari;
    }

    public void setYagisMiktari(Double yagisMiktari) {
        this.yagisMiktari = yagisMiktari;
    }

    public LocalDateTime getOlcumTarihi() {
        return olcumTarihi;
    }

    public void setOlcumTarihi(LocalDateTime olcumTarihi) {
        this.olcumTarihi = olcumTarihi;
    }

    public Barinak getBarinak() {
        return barinak;
    }

    public void setBarinak(Barinak barinak) {
        this.barinak = barinak;
    }
}
