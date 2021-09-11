package com.springreactjs.appvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreactjs.appvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
