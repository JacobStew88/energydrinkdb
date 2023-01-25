package com.energydrinkdb.service;

import java.util.List;

import com.energydrinkdb.entity.Brands;


public interface BrandService {

	//post a brand... CREATE
	public Brands saveBrands(Brands brands);
	
	//get all brands
	public List<Brands> getAllBrands();
	
	//get by PK
	public Brands getBrandsByPK(int brand_pk);
		
	//update brand
	public Brands updateBrands(Brands brands, int brand_pk);
		
	//delete brand
	public void deleteBrands(int brand_pk);
}
