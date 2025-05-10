package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Gider;
import com.hayvanTakip.hayvanTakip.service.GiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/giderler")
@CrossOrigin(origins = "http://localhost:3000")
public class GiderController {

    @Autowired
    private GiderService giderService;

    @GetMapping
    public List<Gider> getAll() {
        return giderService.getAll();
    }

    @GetMapping("/{id}")
    public Gider getById(@PathVariable Long id) {
        return giderService.getById(id);
    }

    @PostMapping
    public Gider save(@RequestBody Gider gider) {
        return giderService.save(gider);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        giderService.delete(id);
    }
}
