
package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Gelir;
import com.hayvanTakip.hayvanTakip.service.GelirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gelirler")
@CrossOrigin(origins = "http://localhost:3000")
public class GelirController {

    @Autowired
    private GelirService gelirService;

    @GetMapping
    public List<Gelir> getAll() {
        return gelirService.getAll();
    }

    @GetMapping("/{id}")
    public Gelir getById(@PathVariable Long id) {
        return gelirService.getById(id);
    }

    @PostMapping
    public Gelir save(@RequestBody Gelir gelir) {
        return gelirService.save(gelir);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        gelirService.delete(id);
    }
    @PutMapping("/{id}")
public Gelir update(@PathVariable Long id, @RequestBody Gelir gelir) {
    gelir.setId(id);
    return gelirService.save(gelir); 
}

}
