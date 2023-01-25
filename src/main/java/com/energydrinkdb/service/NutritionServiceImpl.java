package com.energydrinkdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energydrinkdb.entity.Brands;
import com.energydrinkdb.entity.NutritionFacts;
import com.energydrinkdb.exception.ResourceNotFoundException;
import com.energydrinkdb.repository.NutritionRepository;

@Service
public class NutritionServiceImpl implements NutritionService{
	
	@Autowired
	private NutritionRepository nutritionRepository;
	
	public NutritionServiceImpl(NutritionRepository nutritionRepository) {
		this.nutritionRepository = nutritionRepository;
	}

	//creating a fact POST
	@Override
	public NutritionFacts saveNutritionFacts(NutritionFacts nutritionFacts) {
		return nutritionRepository.save(nutritionFacts);
	
	}

	//Update a fact PUT
	@Override
	public NutritionFacts updateNutritionFacts(NutritionFacts nutritionFacts, int nutrition_pk) {
		NutritionFacts existingFact = nutritionRepository.findById(nutrition_pk).orElseThrow(() -> new ResourceNotFoundException
				("nutrition", "PK", nutrition_pk));
		existingFact.setNutrition_pk(nutritionFacts.getNutrition_pk());
		existingFact.setCaffine(nutritionFacts.getCaffine());
		existingFact.setCalories(nutritionFacts.getCalories());
		existingFact.setSodium(nutritionFacts.getSodium());
		existingFact.setSugar(nutritionFacts.getSugar());
		existingFact.setVitamin_B6(nutritionFacts.getVitamin_B6());
		nutritionRepository.save(existingFact);
		
		return existingFact;
	}

	@Override
	public List<NutritionFacts> getAllNutritionFacts() {
		return nutritionRepository.findAll();		
	}
	

}
