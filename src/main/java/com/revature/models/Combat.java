package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="combat")
public class Combat implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="combat_id")
	private static final long serialVersionUID = 1L;
	private int combatId;

	@Column(name="wins")
	private int winNum;
	
	@Column(name="losses")
	private int lossNum;
	
	@Column(name="id",nullable=false, unique=true)
	private Superhero id;
	
	@Column(name="enemyId",nullable=false, unique=true)
	private Superhero enemyId;
	
	
	
}
