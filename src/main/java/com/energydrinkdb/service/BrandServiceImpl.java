package com.energydrinkdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.energydrinkdb.entity.Brands;
import com.energydrinkdb.exception.ResourceNotFoundException;
import com.energydrinkdb.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandServiceImpl(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	//this is create
	@Override
	public Brands saveBrands(Brands brands) {
		return brandRepository.save(brands);
	}

	//this is get
	@Override
	public List<Brands> getAllBrands() {
		return brandRepository.findAll();
	}

	//this is also get
	@Override
	public Brands getBrandsByPK(int brand_pk) {
		return brandRepository.findById(brand_pk).orElseThrow(() -> new ResourceNotFoundException
				("energyDrink", "PK", brand_pk));
	}

	//this is update
	@Override
	public Brands updateBrands(Brands brands, int brand_pk) {
		Brands existingEnergyDrink = brandRepository.findById(brand_pk).orElseThrow(() -> new ResourceNotFoundException
				("energyDrink", "PK", brand_pk));
		existingEnergyDrink.setBrand_name(brands.getBrand_name());
		existingEnergyDrink.setManufacturer_fk(brands.getManufacturer_fk());
		brandRepository.save(existingEnergyDrink);
		
		return existingEnergyDrink;
	}

	//this is delete
	@Override
	public void deleteBrands(int brand_pk) {
		Brands existingEnergyDrink = brandRepository.findById(brand_pk).orElseThrow(() -> new ResourceNotFoundException
				("energyDrink", "PK", brand_pk));
		
		brandRepository.deleteById(brand_pk);
	}

}
