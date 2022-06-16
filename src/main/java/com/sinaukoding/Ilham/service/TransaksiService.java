package com.sinaukoding.Ilham.service;


import com.sinaukoding.Ilham.entity.Transaksi;
import com.sinaukoding.Ilham.repository.TransaksiRepos;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaksiService {

    @Autowired
    TransaksiRepos transaksiRepos;

    public List<Transaksi>findAllData(){
        return transaksiRepos.findAll();
    }

    public Transaksi saveTrans(Transaksi saveTrx){
        Transaksi transaksi = transaksiRepos.save(saveTrx);
        return transaksi;
    }
}
