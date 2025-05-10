package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.models.Gelir;
import com.hayvanTakip.hayvanTakip.models.Gider;
import com.hayvanTakip.hayvanTakip.context.FinansContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/finans")
@CrossOrigin(origins = "http://localhost:3000")
public class FinansController {

    @Autowired
    private FinansContext finansContext;

    @PostMapping("/gelir")
    public ResponseEntity<String> ekleGelir(@RequestBody Gelir gelir) {
        finansContext.execute(gelir, "gelir");
        return ResponseEntity.ok("Gelir eklendi.");
    }

    @PostMapping("/gider")
    public ResponseEntity<String> ekleGider(@RequestBody Gider gider) {
        finansContext.execute(gider, "gider");
        return ResponseEntity.ok("Gider eklendi.");
    }
}
