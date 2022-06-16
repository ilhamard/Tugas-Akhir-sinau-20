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
@Table(name = "pembayaran")
public class Pembayaran {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Pembayaran;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date tgl_Bayar;

    private double total;


}
