package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.SalesDetails;

@Repository
public interface SalesDetailsRepository extends JpaRepository<SalesDetails, Integer>{

	List<SalesDetails> findAll();
	
	SalesDetails findById(int id);
	
	SalesDetails save(SalesDetails dtls);
}
