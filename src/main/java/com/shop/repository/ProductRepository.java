package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.Product;
import com.shop.domain.ProductCompany;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findAll();
	
	Product findById(int id);
	
	Product findByName(String name);
	
    List<Product> findByProductCompanyId(ProductCompany company);
	
	Product save(Product product);
}
