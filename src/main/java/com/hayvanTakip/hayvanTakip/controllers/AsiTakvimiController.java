package com.hayvanTakip.hayvanTakip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayvanTakip.hayvanTakip.dtos.response.AsiTakvimiResponse;
import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import com.hayvanTakip.hayvanTakip.service.AsiTakvimiService;

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
    public List<AsiTakvimiResponse> getAll() {
        return service.getAllAsiTakvimi(); 
    }

    @GetMapping("/{id}")
    public AsiTakvimi getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
