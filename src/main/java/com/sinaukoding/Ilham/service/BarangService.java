package com.sinaukoding.Ilham.service;


import com.sinaukoding.Ilham.entity.Barang;
import com.sinaukoding.Ilham.repository.BarangRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangService {

    @Autowired
    BarangRepos barangRepos;

    public List<Barang> findAllData(){
        return barangRepos.findAll();
    }

    public Barang saveBarang(Barang save){
        Barang barang = barangRepos.save(save);
        return barang;
    }
}
