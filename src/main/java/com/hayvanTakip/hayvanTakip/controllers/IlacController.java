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

import com.hayvanTakip.hayvanTakip.dtos.request.IlacRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.IlacResponse;
import com.hayvanTakip.hayvanTakip.service.IlacService;

@RestController
@RequestMapping("/api/ilaclar")
@CrossOrigin(origins = "http://localhost:3000")
public class IlacController {

    @Autowired
    private IlacService ilacService;

    @PostMapping
    public IlacResponse create(@RequestBody IlacRequest request) {
        return ilacService.create(request);
    }

    @PutMapping("/{id}")
    public IlacResponse update(@PathVariable Long id, @RequestBody IlacRequest request) {
        return ilacService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ilacService.delete(id);
    }

    @GetMapping
    public List<IlacResponse> getAll() {
        return ilacService.getAll();
    }

    @GetMapping("/{id}")
    public IlacResponse getById(@PathVariable Long id) {
        return ilacService.getById(id);
    }
}
