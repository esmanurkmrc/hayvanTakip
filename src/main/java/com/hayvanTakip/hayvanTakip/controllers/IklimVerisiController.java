package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.IklimVerisi;
import com.hayvanTakip.hayvanTakip.service.IklimVerisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/iklimverisi")
@CrossOrigin(origins = "http://localhost:3000")
public class IklimVerisiController {

    @Autowired
    private IklimVerisiService iklimVerisiService;

    @PostMapping
    public IklimVerisi save(@RequestBody IklimVerisi veri) {
        return iklimVerisiService.save(veri);
    }

    @PutMapping("/{id}")
    public IklimVerisi update(@PathVariable Long id, @RequestBody IklimVerisi veri) {
        return iklimVerisiService.update(id, veri);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        iklimVerisiService.delete(id);
    }

    @GetMapping("/{id}")
    public IklimVerisi getById(@PathVariable Long id) {
        return iklimVerisiService.getById(id);
    }

    @GetMapping
    public List<IklimVerisi> getAll() {
        return iklimVerisiService.getAll();
    }
}
