package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.HastalikIlacRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HastalikIlacResponse;
import com.hayvanTakip.hayvanTakip.service.HastalikIlacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hastalik-ilac")
@CrossOrigin(origins = "http://localhost:3000")
public class HastalikIlacController {

    @Autowired
    private HastalikIlacService service;

    @PostMapping
    public HastalikIlacResponse create(@RequestBody HastalikIlacRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public HastalikIlacResponse update(@PathVariable Long id, @RequestBody HastalikIlacRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<HastalikIlacResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public HastalikIlacResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
