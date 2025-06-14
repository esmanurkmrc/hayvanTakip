package com.hayvanTakip.hayvanTakip.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "barinaklar")
public class Barinak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;        
    private String konum;      
    private String tip;       
    private Boolean aktif;     
    @OneToMany(mappedBy = "barinak", cascade = CascadeType.ALL)
    private List<IklimVerisi> iklimVerileri;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public List<IklimVerisi> getIklimVerileri() {
        return iklimVerileri;
    }

    public void setIklimVerileri(List<IklimVerisi> iklimVerileri) {
        this.iklimVerileri = iklimVerileri;
    }
}
