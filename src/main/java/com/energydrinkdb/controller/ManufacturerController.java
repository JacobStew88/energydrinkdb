package com.energydrinkdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.energydrinkdb.entity.Manufacturers;
import com.energydrinkdb.service.ManufacturerService;

@RestController
@RequestMapping("/energydrinkdb/manufacturers")
public class ManufacturerController {

	@Autowired
	private ManufacturerService manufacturerService;
	
	@Autowired
	private ManufacturerController (ManufacturerService manufacturerService) {
		super();
		this.manufacturerService = manufacturerService;
	}
	
	//Create a manufacturer of energy drinks
	@PostMapping("/{manufacturer_pk}")
	public ResponseEntity<Manufacturers> saveManufacturer(@RequestBody Manufacturers manufacturers){
		return new ResponseEntity<Manufacturers>
		(manufacturerService.saveManufacturer(manufacturers), HttpStatus.CREATED);
			
	}
	
	//Delete a manufacturer of energy drinks
	@DeleteMapping("/{manufacturer_pk}")
	public ResponseEntity<String> deleteManufacturer(@PathVariable("manufacturer_pk") int manufacturer_pk) {
		manufacturerService.deleteManufacturer(manufacturer_pk);
		return new ResponseEntity<String>("EnergyDrink deleted", HttpStatus.OK);
	}
	
	
}
