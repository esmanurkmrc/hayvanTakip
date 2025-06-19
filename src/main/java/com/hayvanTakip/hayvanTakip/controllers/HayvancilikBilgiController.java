package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.dtos.request.HayvancilikBilgiRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.HayvancilikBilgiResponse;
import com.hayvanTakip.hayvanTakip.service.HayvancilikBilgiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hayvancilik-bilgileri")
@CrossOrigin(origins = "http://localhost:3000")
public class HayvancilikBilgiController {

      public HayvancilikBilgiController() {
        System.out.println("🟢 HayvancilikBilgiController yükleniyor...");
    }

    @Autowired
    private HayvancilikBilgiService hayvancilikBilgiService;

    @PostMapping
    public HayvancilikBilgiResponse create(@RequestBody HayvancilikBilgiRequest request) {
        return hayvancilikBilgiService.create(request);
    }

    @PutMapping("/{id}")
    public HayvancilikBilgiResponse update(@PathVariable Long id, @RequestBody HayvancilikBilgiRequest request) {
        return hayvancilikBilgiService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hayvancilikBilgiService.delete(id);
    }

    @GetMapping("/{id}")
    public HayvancilikBilgiResponse getById(@PathVariable Long id) {
        return hayvancilikBilgiService.getById(id);
    }

    @GetMapping
    public List<HayvancilikBilgiResponse> getAll() {
        return hayvancilikBilgiService.getAll();
    }

    @GetMapping("/kategori")
    public List<HayvancilikBilgiResponse> getByKategori(@RequestParam String kategori) {
        return hayvancilikBilgiService.getByKategori(kategori);
    }

    @GetMapping("/arama")
    public List<HayvancilikBilgiResponse> searchByBaslik(@RequestParam String baslik) {
        return hayvancilikBilgiService.searchByBaslik(baslik);
    }
}
