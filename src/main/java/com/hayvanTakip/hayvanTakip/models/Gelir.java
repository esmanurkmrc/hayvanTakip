package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Gelir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kaynak; 
    private double tutar;
    private LocalDate tarih;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getKaynak() { return kaynak; }
    public void setKaynak(String kaynak) { this.kaynak = kaynak; }

    public double getTutar() { return tutar; }
    public void setTutar(double tutar) { this.tutar = tutar; }

    public LocalDate getTarih() { return tarih; }
    public void setTarih(LocalDate tarih) { this.tarih = tarih; 
    }
}
