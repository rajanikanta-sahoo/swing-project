package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.Distributer;

@Repository
public interface DistributerRepository extends JpaRepository<Distributer, Integer>{

	List<Distributer> findAll();
	
	Distributer findById(int id);
	
	Distributer findByName(String name);
	
	Distributer save(Distributer dist);
}
