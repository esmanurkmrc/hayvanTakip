package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.GorevRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.GorevResponse;
import com.hayvanTakip.hayvanTakip.service.GorevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gorevler")
@CrossOrigin(origins = "http://localhost:3000")
public class GorevController {

    private final GorevService gorevService;

    @Autowired
    public GorevController(GorevService gorevService) {
        this.gorevService = gorevService;
    }

   
    @PostMapping
    public ResponseEntity<GorevResponse> create(@RequestBody GorevRequest request) {
        GorevResponse response = gorevService.create(request);
        return ResponseEntity.ok(response);
    }

   
    @PutMapping("/{id}")
    public ResponseEntity<GorevResponse> update(@PathVariable Long id, @RequestBody GorevRequest request) {
        GorevResponse response = gorevService.update(id, request);
        return ResponseEntity.ok(response);
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        gorevService.delete(id);
        return ResponseEntity.noContent().build();
    }

    
    @GetMapping
    public ResponseEntity<List<GorevResponse>> getAll() {
        return ResponseEntity.ok(gorevService.getAll());
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<GorevResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(gorevService.getById(id));
    }

    
    @GetMapping("/veteriner/{veterinerId}")
    public ResponseEntity<List<GorevResponse>> getByVeteriner(@PathVariable Long veterinerId) {
        return ResponseEntity.ok(gorevService.getByVeterinerId(veterinerId));
    }
}
