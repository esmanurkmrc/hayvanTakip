package com.hayvanTakip.hayvanTakip.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayvanTakip.hayvanTakip.dtos.request.SikSoruRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.SikSoruResponse;
import com.hayvanTakip.hayvanTakip.service.SikSorulanSoruService;

@RestController
@RequestMapping("/api/sorular")
public class SikSorulanSoruController {

    @Autowired
    private SikSorulanSoruService service;

    
    @PostMapping
    public ResponseEntity<SikSoruResponse> soruEkle(@RequestBody SikSoruRequest request) {
        SikSoruResponse response = service.ekle(request);
        return ResponseEntity.ok(response);
    }

    
    @GetMapping
    public ResponseEntity<List<SikSoruResponse>> sorulariListele() {
        return ResponseEntity.ok(service.listele());
    }

 
    @PutMapping("/{id}")
    public ResponseEntity<SikSoruResponse> soruGuncelle(@PathVariable Long id,
                                                        @RequestBody SikSoruRequest request) {
        SikSoruResponse response = service.guncelle(id, request);
        return ResponseEntity.ok(response);
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> soruSil(@PathVariable Long id) {
        service.sil(id);
        return ResponseEntity.noContent().build();
    }
}
