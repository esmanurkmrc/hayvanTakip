package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.response.HastalikBelirtiResponse;
import com.hayvanTakip.hayvanTakip.models.Hastalik;
import com.hayvanTakip.hayvanTakip.service.HastalikBelirtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hastalik-belirtileri")
@CrossOrigin(origins = "http://localhost:3000")
public class HastalikBelirtiController {

    @Autowired
    private HastalikBelirtiService hastalikBelirtiService;

    @GetMapping("/with-names")
    public List<HastalikBelirtiResponse> getAllWithNames() {
        return hastalikBelirtiService.getAllWithNames();
    }

    @GetMapping("/grafik")
    public List<Object[]> getGrafikVerisi() {
        return hastalikBelirtiService.getGrafikVerisi();
    }

    @PostMapping
    public void create(@RequestBody HastalikBelirtiResponse request) {
        hastalikBelirtiService.create(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hastalikBelirtiService.delete(id);
    }

    @PostMapping("/oneri")
    public List<Hastalik> hastalikOner(@RequestBody List<Long> belirtiIdList) {
        return hastalikBelirtiService.onerilenHastaliklariGetir(belirtiIdList);
    }
}
