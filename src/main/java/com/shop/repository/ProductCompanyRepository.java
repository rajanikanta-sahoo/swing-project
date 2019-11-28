package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.ProductCompany;

@Repository
public interface ProductCompanyRepository extends JpaRepository<ProductCompany, Integer>{

	List<ProductCompany> findAll();
	
	ProductCompany findByName(String name);
	
	ProductCompany findByType(String type);
	
	ProductCompany save(ProductCompany company);
}
