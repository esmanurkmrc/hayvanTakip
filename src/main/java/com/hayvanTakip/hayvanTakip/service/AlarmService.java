package com.hayvanTakip.hayvanTakip.service;

import com.hayvanTakip.hayvanTakip.models.AsiTakvimi;
import com.hayvanTakip.hayvanTakip.models.IlacStok;
import com.hayvanTakip.hayvanTakip.models.Randevu;
import com.hayvanTakip.hayvanTakip.repositories.AsiTakvimiRepository;
import com.hayvanTakip.hayvanTakip.repositories.IlacStokRepository;
import com.hayvanTakip.hayvanTakip.repositories.RandevuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlarmService {

    @Autowired
    private RandevuRepository randevuRepository;

    @Autowired
    private AsiTakvimiRepository asiTakvimiRepository;

    @Autowired
    private IlacStokRepository ilacStokRepository;

    
    public List<Randevu> getGecikenRandevular() {
        return randevuRepository.findByTarihBeforeAndDurum(LocalDate.now(), "beklemede");
    }

    
    public List<AsiTakvimi> getGecikenAsilar() {
        return asiTakvimiRepository.findByUygulamaTarihiBefore(LocalDate.now());
    }

    
    public List<IlacStok> getBitmisStoklar() {
        return ilacStokRepository.findByMiktarLessThanEqual(0);
    }
}
