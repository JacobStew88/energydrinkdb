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
@Table(name = "manufacturers")
public class Manufacturers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int manufacturer_pk;
	
	@Column(name = "manufacturer_name")
	private String manufacturer_name;
}
