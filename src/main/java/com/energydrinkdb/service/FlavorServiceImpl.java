package com.energydrinkdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energydrinkdb.entity.Flavors;
import com.energydrinkdb.exception.ResourceNotFoundException;
import com.energydrinkdb.repository.FlavorRepository;

@Service
public class FlavorServiceImpl implements FlavorService{
	
	@Autowired
	private FlavorRepository flavorRepository;
	
	@Autowired FlavorServiceImpl(FlavorRepository flavorRepository){
		this.flavorRepository = flavorRepository;
	}

	//this is create
	@Override
	public Flavors saveFlavor(Flavors flavor) {
		return flavorRepository.save(flavor);
	}

	//this is update
	@Override
	public Flavors updateFlavors(Flavors flavor, int flavor_pk) {
		Flavors existingEnergyDrink = flavorRepository.findById(flavor_pk).orElseThrow(() -> new ResourceNotFoundException
				("energyDrink", "PK", flavor_pk));
		existingEnergyDrink.setFlavors(flavor.getFlavors());
		existingEnergyDrink.setNutrition_fk(flavor.getNutrition_fk());
		flavorRepository.save(existingEnergyDrink);
		
		return existingEnergyDrink;
	}

	// this is delete
	@Override
	public void deleteFlavors(int flavor_pk) {
		Flavors existingEnergyDrink = flavorRepository.findById(flavor_pk).orElseThrow(() -> new ResourceNotFoundException
				("flavor", "PK", flavor_pk));
		
		flavorRepository.deleteById(flavor_pk);
	}

	//this is get
	@Override
	public Flavors getFlavorsByPk(int flavor_pk) {
		return flavorRepository.findById(flavor_pk).orElseThrow(() -> new ResourceNotFoundException
				("energyDrink", "PK", flavor_pk));
	}
	
	//this is get all flavors
	public List<Flavors> getAllFlavors(){
		return flavorRepository.findAll();
	}

}
