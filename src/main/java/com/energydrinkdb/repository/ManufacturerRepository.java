package com.energydrinkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.energydrinkdb.entity.Manufacturers;

public interface ManufacturerRepository extends JpaRepository<Manufacturers, Integer>{

}
