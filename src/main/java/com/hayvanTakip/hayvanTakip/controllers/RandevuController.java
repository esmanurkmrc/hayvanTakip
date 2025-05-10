package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.RandevuRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.RandevuResponse;
import com.hayvanTakip.hayvanTakip.service.RandevuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/randevular")
@CrossOrigin(origins = "http://localhost:3000")
public class RandevuController {

    @Autowired
    private RandevuService service;

    @PostMapping
    public RandevuResponse create(@RequestBody RandevuRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public RandevuResponse update(@PathVariable Long id, @RequestBody RandevuRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<RandevuResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public RandevuResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
