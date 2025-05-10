package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import com.hayvanTakip.hayvanTakip.service.AsiTakvimiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asitakvimi")
@CrossOrigin(origins = "http://localhost:3000")
public class AsiTakvimiController {

    @Autowired
    private AsiTakvimiService service;

    @PostMapping
    public AsiTakvimi create(@RequestBody AsiTakvimi asi) {
        return service.create(asi);
    }

    @PutMapping("/{id}")
    public AsiTakvimi update(@PathVariable Long id, @RequestBody AsiTakvimi asi) {
        return service.update(id, asi);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<AsiTakvimi> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AsiTakvimi getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
