package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.SalginHastalikRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.SalginHastalikResponse;
import com.hayvanTakip.hayvanTakip.service.SalginHastaliklarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salgin-hastaliklar")
@CrossOrigin(origins = "http://localhost:3000") 
public class SalginHastaliklarController {

    @Autowired
    private SalginHastaliklarService salginHastaliklarService;

    @PostMapping
    public ResponseEntity<SalginHastalikResponse> create(@RequestBody SalginHastalikRequest request) {
        return ResponseEntity.ok(salginHastaliklarService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalginHastalikResponse> update(@PathVariable Long id, @RequestBody SalginHastalikRequest request) {
        return ResponseEntity.ok(salginHastaliklarService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        salginHastaliklarService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<SalginHastalikResponse>> getAll() {
        return ResponseEntity.ok(salginHastaliklarService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalginHastalikResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(salginHastaliklarService.getById(id));
    }
}
