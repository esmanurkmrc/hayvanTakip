package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.YemStokRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.YemStokResponse;
import com.hayvanTakip.hayvanTakip.service.YemStokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/yem-stok")
@CrossOrigin(origins = "http://localhost:3000")
public class YemStokController {

    @Autowired
    private YemStokService service;

    @PostMapping
    public YemStokResponse create(@RequestBody YemStokRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public YemStokResponse update(@PathVariable Long id, @RequestBody YemStokRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public YemStokResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<YemStokResponse> getAll() {
        return service.getAll();
    }
}
