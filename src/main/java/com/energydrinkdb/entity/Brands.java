package com.energydrinkdb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "brands")
public class Brands {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int brand_PK;
	
	
	private String brand;
	private int volume;
	private int flavor_FK;
	private int nutrition_FK;
	
}
