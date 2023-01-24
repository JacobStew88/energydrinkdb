package com.energydrinkdb.service;

import java.util.List;

import com.energydrinkdb.entity.Brands;


public interface BrandService {

	//post a energy drink... CREATE
	public Brands saveBrands(Brands brands);
	
	//get all brands
	public List<Brands> getAllBrands();
	
	//get by PK
	public Brands getBrandsByPK(int brand_pk);
		
	//update energy drinks
	public Brands updateBrands(Brands brands, int brand_pk);
		
	//delete energy drinks
	public void deleteBrands(int brand_pk);
}
