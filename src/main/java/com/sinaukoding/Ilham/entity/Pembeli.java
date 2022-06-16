package com.sinaukoding.Ilham.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pembeli")
public class Pembeli {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Pembeli;

    @Column(length = 100)
    private String nama_Pembeli;

    @Column(length = 20)
    private String no_Telp;

    private String alamat;
}
