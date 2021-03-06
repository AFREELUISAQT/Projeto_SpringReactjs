package com.springreactjs.appvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springreactjs.appvendas.dto.SaleSuccessDTO;
import com.springreactjs.appvendas.dto.SaleSumDTO;
import com.springreactjs.appvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.springreactjs.appvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" + "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.springreactjs.appvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))" + "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
