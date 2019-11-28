package com.shop.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shop.domain.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{

	List<Purchase> findAll();
	
	Purchase findById(int id);
	
	Purchase findByBillNo(String no);
	
	List<Purchase> findByPurchaseeDate(Date pdate);
	
	Purchase save(Purchase purchase);
}
