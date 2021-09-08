package com.springreactjs.appvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreactjs.appvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
