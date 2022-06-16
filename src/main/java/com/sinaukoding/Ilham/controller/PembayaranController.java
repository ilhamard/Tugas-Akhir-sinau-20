package com.sinaukoding.Ilham.controller;


import com.sinaukoding.Ilham.common.Response;
import com.sinaukoding.Ilham.entity.Pembayaran;
import com.sinaukoding.Ilham.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "bayar")
@RestController
public class PembayaranController {

    @Autowired
    PembayaranService pembayaranService;

    @GetMapping("getPembayaran")
    public Response findAll(){
        return new Response(pembayaranService.findAllData(),"Berhasil Menyimpan Data Pembayaran", HttpStatus.OK);

    }
    @PostMapping("savePembayaran")
    public Pembayaran SavePemba(@RequestBody Pembayaran pembayaran){
        return pembayaranService.savePemba(pembayaran);
    }

}
