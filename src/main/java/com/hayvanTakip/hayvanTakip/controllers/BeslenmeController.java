package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.BeslenmeRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.BeslenmeResponse;
import com.hayvanTakip.hayvanTakip.service.BeslenmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beslenme")
@CrossOrigin(origins = "http://localhost:3000")
public class BeslenmeController {

    @Autowired
    private BeslenmeService service;

    @GetMapping
    public List<BeslenmeResponse> getAll() {
        return service.getAll();
    }

    @PostMapping
    public BeslenmeResponse create(@RequestBody BeslenmeRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public BeslenmeResponse update(@PathVariable Long id, @RequestBody BeslenmeRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
