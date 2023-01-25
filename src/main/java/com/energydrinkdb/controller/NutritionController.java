package com.energydrinkdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.energydrinkdb.entity.NutritionFacts;
import com.energydrinkdb.service.NutritionService;

@RestController
@RequestMapping("/energydrinkdb/nutritionfacts")
public class NutritionController {
	
	@Autowired
	private NutritionService nutritionService;
	
	@Autowired
	private NutritionController(NutritionService nutritionService) {
		super();
		this.nutritionService = nutritionService;
	}

	//Updating the facts of a flavor
	@PutMapping("/{nutrition_pk}")
	public ResponseEntity<NutritionFacts> updateFlavors(@PathVariable("nutrition_pk") int nutrition_pk, 
			@RequestBody NutritionFacts nutritionFacts){
		return new ResponseEntity<NutritionFacts>(nutritionService.updateNutritionFacts
					(nutritionFacts, nutrition_pk), HttpStatus.OK);
		}
		
	//Create a fact of flavor
	@PostMapping("/{flavor_pk}")
	public ResponseEntity<NutritionFacts> saveNutritionFacts(@RequestBody NutritionFacts nutritionFacts){
		return new ResponseEntity<NutritionFacts>
		(nutritionService.saveNutritionFacts(nutritionFacts), HttpStatus.CREATED);
		
	}
	
	//get all nutrition facts
	@GetMapping()
	public List<NutritionFacts> getAllNutritionFacts(){
		return nutritionService.getAllNutritionFacts();
	}
		
		
}
