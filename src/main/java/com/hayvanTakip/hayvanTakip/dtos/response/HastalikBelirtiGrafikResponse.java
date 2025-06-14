package com.hayvanTakip.hayvanTakip.dtos.response;

public class HastalikBelirtiGrafikResponse {

    private String hastalikAdi;
    private Long belirtiSayisi;

    public HastalikBelirtiGrafikResponse() {}

    public HastalikBelirtiGrafikResponse(String hastalikAdi, Long belirtiSayisi) {
        this.hastalikAdi = hastalikAdi;
        this.belirtiSayisi = belirtiSayisi;
    }

    public String getHastalikAdi() {
        return hastalikAdi;
    }

    public void setHastalikAdi(String hastalikAdi) {
        this.hastalikAdi = hastalikAdi;
    }

    public Long getBelirtiSayisi() {
        return belirtiSayisi;
    }

    public void setBelirtiSayisi(Long belirtiSayisi) {
        this.belirtiSayisi = belirtiSayisi;
    }
}
