package com.revature.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Combat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="combat_id")
	private int combatId;
	
	@Column(name="wins")
	private int winNum;
	
	@Column(name="losses")
	private int lossNum;
	
	
	

}
