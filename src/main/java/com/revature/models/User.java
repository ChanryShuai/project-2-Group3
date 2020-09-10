package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="users_id")
	private int userId;
	
	@Column(name="username",nullable=false, unique=true)
	private String username;
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="user_first_name",nullable=false)
	private String firstname;
	
	@Column(name="user_last_name",nullable=false)
	private String lastname;
	
	@Column(name="user_email",nullable=false, unique=true)
	private String userEmail;
	
	@Column(name="user_score")
	private int userScore;
	
	
	
}
