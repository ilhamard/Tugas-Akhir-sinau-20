package com.sinaukoding.Ilham.service;


import com.sinaukoding.Ilham.entity.Pembeli;
import com.sinaukoding.Ilham.repository.PembeliRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembeliService {

    @Autowired
    PembeliRepos pembeliRepos;

    public List<Pembeli>findAllData(){
        return pembeliRepos.findAll();
    }

    public Pembeli savePembe(Pembeli saveBeli){
        Pembeli pembeli = pembeliRepos.save(saveBeli);
        return pembeli;
    }
}
