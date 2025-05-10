package com.hayvanTakip.hayvanTakip.context;

import com.hayvanTakip.hayvanTakip.dtos.request.UretimRequest;
import com.hayvanTakip.hayvanTakip.dtos.response.UretimResponse;
import com.hayvanTakip.hayvanTakip.strategy.UretimStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UretimContext {

    @Autowired
    private ApplicationContext applicationContext;

    public void kaydet(String tip, UretimRequest request) {
        UretimStrategy strategy = applicationContext.getBean(tip, UretimStrategy.class);
        strategy.kaydet(request);
    }

    public List<UretimResponse> listele(String tip) {
        UretimStrategy strategy = applicationContext.getBean(tip, UretimStrategy.class);
        return strategy.listele();
    }
}
