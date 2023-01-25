package com.energydrinkdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.energydrinkdb.entity.Flavors;
import com.energydrinkdb.service.FlavorService;

@RestController
@RequestMapping("/energydrinkdb/flavors")
public class FlavorsController {

	@Autowired
	private FlavorService flavorService;
	
	@Autowired
	private FlavorsController (FlavorService flavorService) {
		super();
		this.flavorService = flavorService;
	}
	
	//Get a flavor by primary key
	@GetMapping("/{flavor_pk}")
	public ResponseEntity<Flavors> getFlavorsByPk(@PathVariable("flavor_pk") int flavor_pk) {
			return new ResponseEntity<Flavors>(flavorService.getFlavorsByPk(flavor_pk), HttpStatus.OK);
	}
	
	@GetMapping()
	public List<Flavors> getAllFlavors(){
		return flavorService.getAllFlavors();
	}
	
	//Create a flavor of energy drinks
	@PostMapping("/{flavor_pk}")
	public ResponseEntity<Flavors> saveFlavor(@RequestBody Flavors flavor){
		return new ResponseEntity<Flavors>
		(flavorService.saveFlavor(flavor), HttpStatus.CREATED);
		}
	
	//Updating a flavor
		@PutMapping("/{flavor_pk}")
		public ResponseEntity<Flavors> updateFlavors(@PathVariable("flavor_pk") int flavor_pk, 
				@RequestBody Flavors flavor){
			return new ResponseEntity<Flavors>(flavorService.updateFlavors(flavor, flavor_pk), HttpStatus.OK);
		}
		
	//Delete a flavor
		@DeleteMapping("/{flavor_pk}")
		public ResponseEntity<String> deleteFlavors(@PathVariable("flavor_pk") int flavor_pk) {
			flavorService.deleteFlavors(flavor_pk);
			return new ResponseEntity<String>("EnergyDrink deleted", HttpStatus.OK);
		}
		
}
