package com.hayvanTakip.hayvanTakip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayvanTakip.hayvanTakip.dtos.request.VeterinerRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.VeterinerResponse;
import com.hayvanTakip.hayvanTakip.models.Veteriner;
import com.hayvanTakip.hayvanTakip.repositories.VeterinerRepository;
import com.hayvanTakip.hayvanTakip.service.VeterinerService;

@RestController
@RequestMapping("/api/veterinerler")
@CrossOrigin(origins = "http://localhost:3000")
public class VeterinerController {

    private final VeterinerService service;
    private final VeterinerRepository veterinerRepository;

    @Autowired
    public VeterinerController(VeterinerService service, VeterinerRepository veterinerRepository) {
        this.service = service;
        this.veterinerRepository = veterinerRepository;
    }

    @PostMapping("/register")
    public VeterinerResponse register(@RequestBody VeterinerRequest request) {
        return service.create(request);
    }
@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody VeterinerRequest request) {
    System.out.println("Gelen eposta: " + request.getEposta());
    System.out.println("Gelen sifre : " + request.getSifre());

    Veteriner vet = veterinerRepository.findByEposta(request.getEposta());
    System.out.println("Bulunan veteriner: " + (vet != null ? vet.getAd() : "YOK"));

    if (vet != null && vet.getSifre().equals(request.getSifre())) {
        VeterinerResponse response = service.convertToResponse(vet);
        return ResponseEntity.ok(response);
    }

    return ResponseEntity.status(401).body("E-posta veya şifre hatalı.");
}


    @PutMapping("/{id}")
    public VeterinerResponse update(@PathVariable Long id, @RequestBody VeterinerRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<VeterinerResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public VeterinerResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
