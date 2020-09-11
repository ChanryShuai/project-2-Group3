package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="superheroes")
public class Superhero {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sup_id")
	private int id;
	
	@Column(name="superhero_name",nullable=false, unique=true)
	private String name;
	
	@Column(name="power_stats",nullable=false)
	private PowerStats powerStats;
	
	
	

}
