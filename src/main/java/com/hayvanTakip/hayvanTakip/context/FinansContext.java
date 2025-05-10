package com.hayvanTakip.hayvanTakip.context;

import com.hayvanTakip.hayvanTakip.strategy.FinansStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinansContext {

    @Autowired
    private FinansStrategy finansStrategy;

    public void execute(Object dto, String tip) {
        finansStrategy.islemYap(dto, tip);
    }
}
