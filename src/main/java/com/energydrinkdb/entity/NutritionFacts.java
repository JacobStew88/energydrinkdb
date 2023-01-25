package com.energydrinkdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "nutrition_facts")
public class NutritionFacts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nutrition_pk;
	
	@Column(name = "caffine")
	private String caffine;
	
	@Column(name = "calories")
	private String calories;
	
	@Column(name = "vitamin_B6")
	private String vitamin_B6;
	
	@Column(name = "sugar")
	private String sugar;
	
	@Column(name = "sodium")
	private String sodium;
	
}
