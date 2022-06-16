package com.sinaukoding.Ilham.entity.dto;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BarangDto {

    private Integer id_barang;
    private String nama_Barang;
    private double harga;
    private int stok;

    private SupplierDto supplierDto;

}
