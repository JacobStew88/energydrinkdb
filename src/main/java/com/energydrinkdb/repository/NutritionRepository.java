package com.energydrinkdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.energydrinkdb.entity.NutritionFacts;

public interface NutritionRepository extends JpaRepository<NutritionFacts, Integer>{

}
