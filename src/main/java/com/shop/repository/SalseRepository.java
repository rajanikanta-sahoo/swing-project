package com.shop.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.Salse;

@Repository
public interface SalseRepository extends JpaRepository<Salse, Integer>{

	List<Salse> findAll();
	
	Salse findById(int id);
	
	Salse findByDate(Date date);
	
	Salse save(Salse salse);
}
