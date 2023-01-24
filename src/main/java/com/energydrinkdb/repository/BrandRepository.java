package com.energydrinkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.energydrinkdb.entity.Brands;

@Repository("brandRepository")
public interface BrandRepository extends JpaRepository<Brands, Integer>{
	
}



