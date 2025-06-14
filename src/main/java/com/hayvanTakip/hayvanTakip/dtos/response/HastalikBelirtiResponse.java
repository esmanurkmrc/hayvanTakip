package com.hayvanTakip.hayvanTakip.dtos.response;

public class HastalikBelirtiResponse {
    private Long id;
    private Long hastalikId;
    private String hastalikAdi;
    private Long belirtiId;
    private String belirtiAdi;

    public HastalikBelirtiResponse() {}

    public HastalikBelirtiResponse(Long id, Long hastalikId, String hastalikAdi, Long belirtiId, String belirtiAdi) {
        this.id = id;
        this.hastalikId = hastalikId;
        this.hastalikAdi = hastalikAdi;
        this.belirtiId = belirtiId;
        this.belirtiAdi = belirtiAdi;
    }

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

    public String getHastalikAdi() {
        return hastalikAdi;
    }

    public void setHastalikAdi(String hastalikAdi) {
        this.hastalikAdi = hastalikAdi;
    }

    public Long getBelirtiId() {
        return belirtiId;
    }

    public void setBelirtiId(Long belirtiId) {
        this.belirtiId = belirtiId;
    }

    public String getBelirtiAdi() {
        return belirtiAdi;
    }

    public void setBelirtiAdi(String belirtiAdi) {
        this.belirtiAdi = belirtiAdi;
    }
}
