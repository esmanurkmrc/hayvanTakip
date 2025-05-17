package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.IlacStokRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.IlacStokResponse;
import com.hayvanTakip.hayvanTakip.service.IlacStokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ilac-stok")
@CrossOrigin(origins = "http://localhost:3000")
public class IlacStokController {

    @Autowired
    private IlacStokService service;

    @PostMapping
    public IlacStokResponse create(@RequestBody IlacStokRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public IlacStokResponse update(@PathVariable Long id, @RequestBody IlacStokRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public IlacStokResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<IlacStokResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/ilac/{ilacId}")
    public List<IlacStokResponse> getByIlacId(@PathVariable Long ilacId) {
        return service.getByIlacId(ilacId);
    }
}
