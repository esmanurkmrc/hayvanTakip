package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Satis;
import com.hayvanTakip.hayvanTakip.service.SatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/satislar")
@CrossOrigin(origins = "http://localhost:3000")
public class SatisController {

    @Autowired
    private SatisService satisService;

    @GetMapping
    public List<Satis> getAll() {
        return satisService.getAll();
    }

    @GetMapping("/{id}")
    public Satis getById(@PathVariable Long id) {
        return satisService.getById(id);
    }

    @PostMapping
    public Satis save(@RequestBody Satis satis) {
        return satisService.save(satis);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        satisService.delete(id);
    }
}
