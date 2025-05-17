package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.dtos.request.IlacStokRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.IlacStokResponse;
import com.hayvanTakip.hayvanTakip.models.Ilac;
import com.hayvanTakip.hayvanTakip.models.IlacStok;
import com.hayvanTakip.hayvanTakip.repositories.IlacRepository;
import com.hayvanTakip.hayvanTakip.repositories.IlacStokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IlacStokServiceImpl implements IlacStokService {

    @Autowired
    private IlacStokRepository repository;

    @Autowired
    private IlacRepository ilacRepository;

    @Override
    public IlacStokResponse create(IlacStokRequest request) {
        Ilac ilac = ilacRepository.findById(request.getIlacId())
                .orElseThrow(() -> new RuntimeException("İlaç bulunamadı"));

        IlacStok stok = new IlacStok();
        stok.setIlacId(request.getIlacId());
        stok.setMiktar(request.getMiktar());
        stok.setBirimFiyat(request.getBirimFiyat());
        stok.setAciklama(request.getAciklama());
        stok.setGirisTarihi(request.getGirisTarihi());
        stok.setSonKullanmaTarihi(request.getSonKullanmaTarihi());

        stok = repository.save(stok);
        return mapToResponse(stok, ilac.getIlacAdi());
    }

    @Override
    public IlacStokResponse update(Long id, IlacStokRequest request) {
        IlacStok stok = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Stok kaydı bulunamadı"));

        Ilac ilac = ilacRepository.findById(request.getIlacId())
                .orElseThrow(() -> new RuntimeException("İlaç bulunamadı"));

        stok.setIlacId(request.getIlacId());
        stok.setMiktar(request.getMiktar());
        stok.setBirimFiyat(request.getBirimFiyat());
        stok.setAciklama(request.getAciklama());
        stok.setGirisTarihi(request.getGirisTarihi());
        stok.setSonKullanmaTarihi(request.getSonKullanmaTarihi());

        return mapToResponse(repository.save(stok), ilac.getIlacAdi());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public IlacStokResponse getById(Long id) {
        IlacStok stok = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kayıt bulunamadı"));
        String ilacAdi = ilacRepository.findById(stok.getIlacId())
                .map(Ilac::getIlacAdi).orElse("Bilinmiyor");

        return mapToResponse(stok, ilacAdi);
    }

    @Override
    public List<IlacStokResponse> getAll() {
        return repository.findAll().stream()
                .map(stok -> {
                    String ilacAdi = ilacRepository.findById(stok.getIlacId())
                            .map(Ilac::getIlacAdi).orElse("Bilinmiyor");
                    return mapToResponse(stok, ilacAdi);
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<IlacStokResponse> getByIlacId(Long ilacId) {
        return repository.findByIlacId(ilacId).stream()
                .map(stok -> {
                    String ilacAdi = ilacRepository.findById(ilacId)
                            .map(Ilac::getIlacAdi).orElse("Bilinmiyor");
                    return mapToResponse(stok, ilacAdi);
                })
                .collect(Collectors.toList());
    }

    private IlacStokResponse mapToResponse(IlacStok stok, String ilacAdi) {
        IlacStokResponse response = new IlacStokResponse();
        response.setId(stok.getId());
        response.setIlacId(stok.getIlacId());
        response.setIlacAdi(ilacAdi);
        response.setMiktar(stok.getMiktar());
        response.setBirimFiyat(stok.getBirimFiyat());
        response.setAciklama(stok.getAciklama());
        response.setGirisTarihi(stok.getGirisTarihi());
        response.setSonKullanmaTarihi(stok.getSonKullanmaTarihi());
        return response;
    }
}
