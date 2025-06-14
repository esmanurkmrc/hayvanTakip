package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Barinak;
import com.hayvanTakip.hayvanTakip.service.BarinakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barinaklar")
@CrossOrigin(origins = "http://localhost:3000") 
public class BarinakController {

    @Autowired
    private BarinakService barinakService;

    @PostMapping
    public Barinak save(@RequestBody Barinak barinak) {
        return barinakService.save(barinak);
    }

    @PutMapping("/{id}")
    public Barinak update(@PathVariable Long id, @RequestBody Barinak barinak) {
        return barinakService.update(id, barinak);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        barinakService.delete(id);
    }

    @GetMapping("/{id}")
    public Barinak getById(@PathVariable Long id) {
        return barinakService.getById(id);
    }

    @GetMapping
    public List<Barinak> getAll() {
        return barinakService.getAll();
    }
}
