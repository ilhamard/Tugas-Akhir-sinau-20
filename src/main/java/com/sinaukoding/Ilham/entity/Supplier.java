package com.sinaukoding.Ilham.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_supplier;

    @Column(length = 100)
    private String nama_supplier;

    @Column(length = 20)
    private String no_telp;

    private String alamat;
}
