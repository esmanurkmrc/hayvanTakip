package com.hayvanTakip.hayvanTakip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayvanTakip.hayvanTakip.dtos.request.HayvanRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HayvanResponse;
import com.hayvanTakip.hayvanTakip.service.HayvanService;

@RestController
@RequestMapping("/api/hayvanlar")
public class HayvanController {

    @Autowired
    private HayvanService hayvanService;

    @PostMapping
    public HayvanResponse create(@RequestBody HayvanRequest dto) {
        return hayvanService.create(dto);
    }
    

    @PutMapping("/{id}")
    public HayvanResponse update(@PathVariable Long id, @RequestBody HayvanRequest request) {
        return hayvanService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hayvanService.delete(id);
    }

    @GetMapping
    public List<HayvanResponse> getAll() {
        return hayvanService.getAll();
    }

    @GetMapping("/{id}")
    public HayvanResponse getById(@PathVariable Long id) {
        return hayvanService.getById(id);
    }
}
