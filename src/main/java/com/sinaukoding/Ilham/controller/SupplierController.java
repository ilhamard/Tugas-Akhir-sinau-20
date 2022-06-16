package com.sinaukoding.Ilham.controller;


import com.sinaukoding.Ilham.common.Response;
import com.sinaukoding.Ilham.entity.Supplier;
import com.sinaukoding.Ilham.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @GetMapping("getsupplier")
    public Response findAll(){
        return new Response(supplierService.findAllData(),"berhasil", HttpStatus.OK);

    }

    @PostMapping("savesupplier")
    public Supplier SaveSupplier(@RequestBody Supplier supplier){
        return supplierService.saveSupp(supplier);
    }
}
