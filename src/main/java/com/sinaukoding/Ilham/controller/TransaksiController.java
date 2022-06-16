package com.sinaukoding.Ilham.controller;


import com.sinaukoding.Ilham.common.Response;
import com.sinaukoding.Ilham.entity.Transaksi;
import com.sinaukoding.Ilham.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "trans")
public class TransaksiController {
    @Autowired
    TransaksiService transaksiService;

    @GetMapping("getTrans")
    public Response findAll(){
        return new Response(transaksiService.findAllData(),"Berhasil Menyimpan Data Transaksi", HttpStatus.OK);

    }

    @PostMapping("saveTrans")
    public Transaksi SaveTrans(@RequestBody Transaksi transaksi){
        return transaksiService.saveTrans(transaksi);
    }
}
