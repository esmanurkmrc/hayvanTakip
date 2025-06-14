package com.hayvanTakip.hayvanTakip.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gelir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kaynak;
    private double tutar;

    @JsonFormat(pattern = "yyyy-MM-dd") 
    private LocalDate tarih;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getKaynak() { return kaynak; }
    public void setKaynak(String kaynak) { this.kaynak = kaynak; }

    public double getTutar() { return tutar; }
    public void setTutar(double tutar) { this.tutar = tutar; }

    public LocalDate getTarih() { return tarih; }
    public void setTarih(LocalDate tarih) { this.tarih = tarih; }
}
