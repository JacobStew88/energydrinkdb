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
@Table(name = "flavors")
public class Flavors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flavor_pk;
	
	@Column(name = "nutrition_fk")
	private int nutrition_fk;
	
	@Column(name = "flavors")
	private String flavors;

	
	
}
