package com.sinaukoding.Ilham.repository;

import com.sinaukoding.Ilham.entity.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepos extends JpaRepository<Transaksi, Integer> {
}
