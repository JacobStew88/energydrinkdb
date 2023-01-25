package com.energydrinkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.energydrinkdb.entity.Flavors;


public interface FlavorRepository extends JpaRepository<Flavors, Integer> {

}
