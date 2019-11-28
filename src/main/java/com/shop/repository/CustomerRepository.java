package com.shop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	List<Customer> findAll();
	
	Customer findById(int id);
	
	Customer findByName(String name);
	
	Customer findByMobileNumber(String no);
	
	Customer save(Customer cust);
	
//	@Query(value="select * from area a where a.name = :name", nativeQuery = true)
//	Area findAreaByNameNative(@Param("name") String name);
}
