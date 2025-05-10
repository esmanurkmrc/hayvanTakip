package com.hayvanTakip.hayvanTakip.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class HayvanRequest
{

    private String kupeNo;
    private String yasamAlani;
    private String irk;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dogumTarihi;

    private String cinsiyet;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate olumTarihi;

    public String getKupeNo()
    {
        return kupeNo;
    }

    public void setKupeNo(String kupeNo)
    {
        this.kupeNo = kupeNo;
    }

    public String getYasamAlani()
    {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani)
    {
        this.yasamAlani = yasamAlani;
    }

    public String getIrk()
    {
        return irk;
    }

    public void setIrk(String irk)
    {
        this.irk = irk;
    }

    public LocalDate getDogumTarihi()
    {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi)
    {
        this.dogumTarihi = dogumTarihi;
    }

    public String getCinsiyet()
    {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet)
    {
        this.cinsiyet = cinsiyet;
    }

    public LocalDate getOlumTarihi()
    {
        return olumTarihi;
    }

    public void setOlumTarihi(LocalDate olumTarihi)
    {
        this.olumTarihi = olumTarihi;
    }
}
