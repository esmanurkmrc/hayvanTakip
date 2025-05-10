package com.hayvanTakip.hayvanTakip.controllers;

import com.hayvanTakip.hayvanTakip.context.UretimContext;
import com.hayvanTakip.hayvanTakip.dtos.request.UretimRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.UretimResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/uretim")
@CrossOrigin(origins = "http://localhost:3000")
public class UretimController {

    @Autowired
    private UretimContext context;

    @PostMapping("/{tip}")
    public void kaydet(@PathVariable String tip, @RequestBody UretimRequest request) {
        context.kaydet(tip, request);
    }

    @GetMapping("/{tip}")
    public List<UretimResponse> listele(@PathVariable String tip) {
        return context.listele(tip);
    }
}
