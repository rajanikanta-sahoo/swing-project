package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.PurchaseDetails;

@Repository
public interface PurchaseDetailsRepository extends JpaRepository<PurchaseDetails, Integer>{

	List<PurchaseDetails> findAll();
	
	PurchaseDetails findById(int id);
	
	PurchaseDetails save(PurchaseDetails pdtl);
}
