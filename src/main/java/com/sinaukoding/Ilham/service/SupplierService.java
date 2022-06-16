package com.sinaukoding.Ilham.service;


import com.sinaukoding.Ilham.entity.Supplier;
import com.sinaukoding.Ilham.repository.SupplierRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    SupplierRepos supplierRepos;

    public List<Supplier> findAllData(){
        return supplierRepos.findAll();
    }

    public Supplier saveSupp(Supplier savesupp){
        Supplier supplier = supplierRepos.save(savesupp);
        return supplier;
    }
}
