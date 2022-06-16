package com.sinaukoding.Ilham.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class PembayaranDto {

    private Integer id_Pembayaran;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date tgl_Bayar;
    private double total;
}
