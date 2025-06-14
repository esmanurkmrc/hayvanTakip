package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Belirti;
import com.hayvanTakip.hayvanTakip.repositories.BelirtiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/belirtiler")
@CrossOrigin(origins = "http://localhost:3000") 
public class BelirtiController {

    @Autowired
    private BelirtiRepository belirtiRepository;

    @GetMapping
    public List<Belirti> getAll() {
        return belirtiRepository.findAll();
    }

    @PostMapping
    public Belirti create(@RequestBody Belirti belirti) {
        return belirtiRepository.save(belirti);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        belirtiRepository.deleteById(id);
    }
}
