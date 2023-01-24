package com.energydrinkdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.energydrinkdb.entity.Brands;
import com.energydrinkdb.repository.BrandRepository;
import com.energydrinkdb.service.BrandService;

@RestController
@RequestMapping("/energydrinkdb/brands")
public class BrandController {

	private BrandRepository brandRepository;

	BrandController(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	//READ
	@GetMapping("/energy_drinks")
	public List<Brands> getAllBrands(){
		return brandRepository.findAll();
	}
}
