package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Yapilacak;
import com.hayvanTakip.hayvanTakip.service.YapilacakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/yapilacaklar")
@CrossOrigin(origins = "http://localhost:3000")
public class YapilacakController {

    @Autowired
    private YapilacakService yapilacakService;

   
    @GetMapping
    public List<Yapilacak> getAll() {
        return yapilacakService.getAll();
    }

    
    @GetMapping("/{id}")
    public Yapilacak getById(@PathVariable Long id) {
        return yapilacakService.getById(id);
    }

   
    @PostMapping
    public Yapilacak save(@RequestBody Yapilacak yeniYapilacak) {
        return yapilacakService.save(yeniYapilacak);
    }

    @PutMapping("/{id}")
    public Yapilacak update(@PathVariable Long id, @RequestBody Yapilacak guncellenmis) {
        return yapilacakService.update(id, guncellenmis);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        yapilacakService.delete(id);
    }
}
