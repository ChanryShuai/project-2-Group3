package com.revature.models;

/*User model class: including user credentials, user info, and user win/loss records*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.revature.utils.PasswordUtil;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private static final long serialVersionUID = 1L;
	private int userId;

	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "first_name", nullable = false)
	private String first;

	@Column(name = "last_name", nullable = false)
	private String last;

	@Column(name = "user_wins")
	private int userWins;

	@Column(name = "user_losses")
	private int userLosses;

	@Column(name = "user_record")
	private double userRecord;

	public User() {
		super();
	}

	public User(String username, String password, String first, String last, int userWins, int userLosses,
			double userRecord) {
		super();
		this.username = username;

		//password encryption
		String salt = PasswordUtil.getSalt(30);
		this.password = PasswordUtil.generateSecurePassword(password, salt);

		this.first = first;
		this.last = last;
		this.userWins = userWins;
		this.userLosses = userLosses;
		
		double wins = userWins;
		double losses = userLosses;
		if (userLosses != 0) {
			this.userRecord = wins/losses * 100;
		} else {
			this.userRecord = 100;
		}
	}

	public User(int userId, String username, String password, String first, String last, int userWins, int userLosses,
			double userRecord) {
		super();
		this.userId = userId;
		this.username = username;

		String salt = PasswordUtil.getSalt(30);
		this.password = PasswordUtil.generateSecurePassword(password, salt);

		this.first = first;
		this.last = last;
		this.userWins = userWins;
		this.userLosses = userLosses;
		
		double wins = userWins;
		double losses = userLosses;
		if (userLosses != 0) {
			this.userRecord = wins/losses * 100;
		} else {
			this.userRecord = 100;
		}
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getUserWins() {
		return userWins;
	}

	public void setUserWins(int userWins) {
		this.userWins = userWins;
	}

	public int getUserLosses() {
		return userLosses;
	}

	public void setUserLosses(int userLosses) {
		this.userLosses = userLosses;
	}

	public double getUserRecord() {
		return userRecord;
	}

	public void setUserRecord(double userRecord) {
		this.userRecord = userRecord;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
		result = prime * result + userLosses;
		long temp;
		temp = Double.doubleToLongBits(userRecord);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + userWins;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		if (userLosses != other.userLosses)
			return false;
		if (Double.doubleToLongBits(userRecord) != Double.doubleToLongBits(other.userRecord))
			return false;
		if (userWins != other.userWins)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", first=" + first
				+ ", last=" + last + ", userWins=" + userWins + ", userLosses=" + userLosses + ", userRecord="
				+ userRecord + "%]";
	}

}
