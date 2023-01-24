package com.energydrinkdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energydrinkdb.entity.Brands;
import com.energydrinkdb.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandServiceImpl(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	//get all brands
	@Override
	public List<Brands> getAllBrands(){
		return brandRepository.findAll();
	}

}
