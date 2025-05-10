package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.VeterinerRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.VeterinerResponse;
import com.hayvanTakip.hayvanTakip.service.VeterinerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veterinerler")
@CrossOrigin(origins = "http://localhost:3000")
public class VeterinerController {

    @Autowired
    private VeterinerService service;

    @PostMapping
    public VeterinerResponse create(@RequestBody VeterinerRequest request) {
        return service.create(request);
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
