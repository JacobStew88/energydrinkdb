package com.energydrinkdb.service;

import com.energydrinkdb.entity.Manufacturers;

public interface ManufacturerService {
	
	//POST a flavor that corresponds to a brand
		public Manufacturers saveManufacturer(Manufacturers manufacturer);
		
	//DELETE energy drinks
		public void deleteManufacturer(int manufacturer_pk);

}
