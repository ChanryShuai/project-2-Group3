package com.revature.models;

import javax.persistence.*;


@Entity
@Table(name="powerstats")
public class PowerStats {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="powerstats_id")
	private static final long serialVersionUID = 1L;
	private int powerstatsId;
	
	
	private int intelligence;
	
	private int strength;
	
	private int speed;
	
	private int durability;
	
	private int power;
	
	private int combat;
	
	private int statAverage;
	

}
