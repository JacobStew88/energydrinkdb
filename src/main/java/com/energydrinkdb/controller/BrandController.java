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

import com.energydrinkdb.entity.Brands;
import com.energydrinkdb.service.BrandService;

@RestController
@RequestMapping("/energydrinkdb/brands")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@Autowired
	private BrandController (BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	//Create a brand of energy drinks
	@PostMapping()
	public ResponseEntity<Brands> saveEnergyDrinks(@RequestBody Brands brands){
		return new ResponseEntity<Brands>
		(brandService.saveBrands(brands), HttpStatus.CREATED); 
	}

	//read all brands
	@GetMapping()
	public List<Brands> getAllBrands(){
		return brandService.getAllBrands();
	}
	
	//get brand by PK
	@GetMapping("/{brand_pk}")
	public ResponseEntity<Brands>getEnergyDrinksByPK(@PathVariable("brand_pk") int brand_PK){
		return new ResponseEntity<Brands>
		(brandService.getBrandsByPK(brand_PK), HttpStatus.OK);
	}
	
	//Updating the brand
	@PutMapping("/{brand_pk}")
	public ResponseEntity<Brands> UpdateEnergyDrinks(@PathVariable("brand_pk") int brand_PK, 
			@RequestBody Brands brands){
		return new ResponseEntity<Brands>(brandService.updateBrands(brands, brand_PK), HttpStatus.OK);
	}
	
	//Delete an entire brand
	@DeleteMapping("/{brand_pk}")
	public ResponseEntity<String> deleteEnergyDrinks(@PathVariable("brand_pk") int brand_PK) {
		brandService.deleteBrands(brand_PK);
		return new ResponseEntity<String>("EnergyDrink deleted", HttpStatus.OK);
	}
}
