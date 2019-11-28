package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.Product;
import com.shop.domain.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{

	List<Stock> findAll();
	
	Stock findByProductId(Product product);
	
	Stock save(Stock stock);
}
