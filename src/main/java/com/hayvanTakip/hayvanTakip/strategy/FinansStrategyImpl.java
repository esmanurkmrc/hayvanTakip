package com.hayvanTakip.hayvanTakip.strategy;

import com.hayvanTakip.hayvanTakip.models.Gelir;
import com.hayvanTakip.hayvanTakip.models.Gider;
import com.hayvanTakip.hayvanTakip.service.GelirService;
import com.hayvanTakip.hayvanTakip.service.GiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinansStrategyImpl implements FinansStrategy {

    @Autowired
    private GelirService gelirService;

    @Autowired
    private GiderService giderService;

    @Override
    public void islemYap(Object dto, String tip) {
        if ("gelir".equalsIgnoreCase(tip) && dto instanceof Gelir) {
            gelirService.save((Gelir) dto);
            System.out.println("Gelir başarıyla işlendi.");
        } else if ("gider".equalsIgnoreCase(tip) && dto instanceof Gider) {
            giderService.save((Gider) dto);
            System.out.println("Gider başarıyla işlendi.");
        } else {
            throw new IllegalArgumentException("Geçersiz işlem tipi veya DTO sınıfı.");
        }
    }
}
