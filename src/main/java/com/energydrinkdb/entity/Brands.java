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
@Table(name = "brands")
public class Brands {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brand_pk;

	@Column(name = "brand_name")
	private String brand_name;
	
	@Column(name = "volume")
	private String volume;
	
	@Column(name = "manufacturer_fk")
	private int manufacturer_fk;
	
	
}
