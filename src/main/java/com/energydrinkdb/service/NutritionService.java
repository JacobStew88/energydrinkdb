package com.energydrinkdb.service;

import java.util.List;

import com.energydrinkdb.entity.NutritionFacts;

public interface NutritionService {
	
	//get all nutrition facts
		public List<NutritionFacts> getAllNutritionFacts();

	//POST creating a new fact that corresponds to an energy drink
		public NutritionFacts saveNutritionFacts(NutritionFacts nutritionFacts);
		
	//UPDATE facts
		public NutritionFacts updateNutritionFacts(NutritionFacts nutritionFacts, 
				int nutrition_pk);
}
