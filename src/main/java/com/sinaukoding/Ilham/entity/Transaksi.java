package com.sinaukoding.Ilham.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "transaksi")
public class Transaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Transaksi;

    @ManyToOne
    @JoinColumn(name = "id_barang")
    private Barang barang;

    @ManyToOne
    @JoinColumn(name = "id_pembeli")
    private Pembeli pembeli;

    @ManyToOne
    @JoinColumn(name = "id_pembayaran")
    private Pembayaran pembayaran;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date tgl_Transaksi;

    private String keterangan;
}
