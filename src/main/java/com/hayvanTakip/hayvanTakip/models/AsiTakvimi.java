package com.hayvanTakip.hayvanTakip.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AsiTakvimi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long hayvanId;

    private LocalDate uygulamaTarihi;

    private Long veterinerId;

    private String aciklama;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veterinerId", insertable = false, updatable = false)
    private Veteriner veteriner;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getHayvanId() { return hayvanId; }
    public void setHayvanId(Long hayvanId) { this.hayvanId = hayvanId; }

    public LocalDate getUygulamaTarihi() { return uygulamaTarihi; }
    public void setUygulamaTarihi(LocalDate uygulamaTarihi) { this.uygulamaTarihi = uygulamaTarihi; }

    public Long getVeterinerId() { return veterinerId; }
    public void setVeterinerId(Long veterinerId) { this.veterinerId = veterinerId; }

    public String getAciklama() { return aciklama; }
    public void setAciklama(String aciklama) { this.aciklama = aciklama; }

    public Veteriner getVeteriner() { return veteriner; }
    public void setVeteriner(Veteriner veteriner) { this.veteriner = veteriner; }
}
