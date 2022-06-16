package com.sinaukoding.Ilham.controller;


import com.sinaukoding.Ilham.common.Response;
import com.sinaukoding.Ilham.entity.Pembeli;
import com.sinaukoding.Ilham.service.PembeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "pembeli")
@RestController
public class PembeliController {

    @Autowired
    PembeliService pembeliService;

    @GetMapping("getpembeli")
    public Response findAll(){
        return new Response(pembeliService.findAllData(),"Berhasil Menyimpan Data Pembeli", HttpStatus.OK);

    }

    @PostMapping("savePembeli")
    public Pembeli SavePembeli(@RequestBody Pembeli pembeli){
        return pembeliService.savePembe(pembeli);
    }
}

