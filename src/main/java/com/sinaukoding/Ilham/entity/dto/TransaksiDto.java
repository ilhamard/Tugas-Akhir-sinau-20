package com.sinaukoding.Ilham.entity.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransaksiDto {

    private Integer id_Transaksi;
    private BarangDto barangDto;
    private PembayaranDto pembayaranDto;
    private PembeliDto pembeliDto;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date tgl_Transaksi;
    private String keterangan;
}
