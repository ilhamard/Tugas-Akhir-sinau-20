package com.sinaukoding.Ilham.service;


import com.sinaukoding.Ilham.entity.Pembayaran;
import com.sinaukoding.Ilham.repository.PembayaranRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembayaranService {

    @Autowired
    PembayaranRepos pembayaranRepos;

    public List<Pembayaran>findAllData(){
        return pembayaranRepos.findAll();
    }

    public Pembayaran savePemba(Pembayaran saveBayar){
        Pembayaran pembayaran = pembayaranRepos.save(saveBayar);
        return pembayaran;
    }
}
