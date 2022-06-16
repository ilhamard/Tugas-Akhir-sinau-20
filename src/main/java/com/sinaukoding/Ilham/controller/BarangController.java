package com.sinaukoding.Ilham.controller;

import com.sinaukoding.Ilham.common.Response;
import com.sinaukoding.Ilham.entity.Barang;
import com.sinaukoding.Ilham.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "barang")
public class BarangController {

    @Autowired
    BarangService barangService;

    @GetMapping("getbarang")
    public Response findAll(){
        return new Response(barangService.findAllData(),"Berhasil.", HttpStatus.OK);

    }

    @PostMapping("savebarang")
    public Barang SaveBarang(@RequestBody Barang barang){
        return barangService.saveBarang(barang);
    }
}
