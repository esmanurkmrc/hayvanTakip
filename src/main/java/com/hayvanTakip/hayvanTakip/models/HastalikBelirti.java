package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HastalikBelirti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long hastalikId;
    private Long belirtiId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHastalikId() {
        return hastalikId;
    }

    public void setHastalikId(Long hastalikId) {
        this.hastalikId = hastalikId;
    }

    public Long getBelirtiId() {
        return belirtiId;
    }

    public void setBelirtiId(Long belirtiId) {
        this.belirtiId = belirtiId;
    }
}
