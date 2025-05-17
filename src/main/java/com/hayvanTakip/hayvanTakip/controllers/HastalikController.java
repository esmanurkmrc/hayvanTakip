package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.HastalikRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HastalikResponse;
import com.hayvanTakip.hayvanTakip.service.HastalikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hastaliklar")
@CrossOrigin(origins = "http://localhost:3000")
public class HastalikController {

    @Autowired
    private HastalikService service;

    @PostMapping
    public HastalikResponse create(@RequestBody HastalikRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public HastalikResponse update(@PathVariable Long id, @RequestBody HastalikRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<HastalikResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public HastalikResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
