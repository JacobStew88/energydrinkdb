package com.energydrinkdb.service;

import java.util.List;

import com.energydrinkdb.entity.Flavors;

public interface FlavorService {

	//GET a flavor
	public Flavors getFlavorsByPk(int flavor_pk);
	
	//POST a flavor that corresponds to a brand
	public Flavors saveFlavor(Flavors flavor);
	
	//UPDATE flavor
	public Flavors updateFlavors(Flavors flavors, int flavor_pk);
			
	//DELETE flavor
	public void deleteFlavors(int flavor_pk);
	
	//GET all flavors
	public List<Flavors> getAllFlavors();
}
