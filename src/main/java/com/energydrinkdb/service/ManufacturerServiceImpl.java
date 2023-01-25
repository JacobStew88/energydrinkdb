package com.energydrinkdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energydrinkdb.entity.Manufacturers;
import com.energydrinkdb.exception.ResourceNotFoundException;
import com.energydrinkdb.repository.ManufacturerRepository;


@Service
public class ManufacturerServiceImpl implements ManufacturerService{

	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@Autowired ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository){
		this.manufacturerRepository = manufacturerRepository;
	}
		
	//this is delete
	@Override
	public void deleteManufacturer(int manufacturer_pk) {
		Manufacturers existingManufacturer = manufacturerRepository.findById(manufacturer_pk).orElseThrow(() -> new ResourceNotFoundException
				("manufacturer", "PK", manufacturer_pk));
		
		manufacturerRepository.deleteById(manufacturer_pk);
	}

	//this is create
	@Override
	public Manufacturers saveManufacturer(Manufacturers manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}

}
