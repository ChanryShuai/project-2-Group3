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
	private int supId;
	
	@Column(name="superhero_name",nullable=false, unique=true)
	private String name;
	
	@Column(name="password",nullable=false)
	private PowerStats powerStats;
	
	@Column(name="user_first_name",nullable=false)
	private String firstname;
	
	@Column(name="user_last_name",nullable=false)
	private String lastname;
	
	@Column(name="user_email",nullable=false, unique=true)
	private String userEmail;
	
	@Column(name="user_score")
	private int userScore;
	

}
