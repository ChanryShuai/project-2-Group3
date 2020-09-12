package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.IUserDAO;
import com.revature.daos.UserDAO;
import com.revature.models.User;

public class UserService {
	
	private static final Logger log = LogManager.getLogger(UserService.class);
	private static IUserDAO iu = new UserDAO();

	public User findByLoginInfo(String username, String password) {
		log.info("Returning user from users with username of " + username + " and password of " + password);
		return iu.validUser(username, password);
	}

}
