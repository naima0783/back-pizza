package fr.idformation.mariopizza.security.Dto;

import fr.idformation.mariopizza.security.models.User;

public class UserDto {

	/*
	 * the user's phonenumber .
	 */
	private String phonenumber;
	/*
	 * the user's firstname .
	 */
	private String firstname;
	/*
	 * the user's lastname .
	 */
	private String lastname;
	/*
	 * the user's address .
	 */
	private String address;
	/*
	 * the user's password .
	 */
	private String password;
	/*
	 * the user's role .
	 */
	private String role;

	/**
	 * the constructor of UserDTO .
	 * 
	 * @param user the user 
	 */
	public UserDto(User user) {
		this.phonenumber = user.getUsername();
		this.firstname = user.getFirstname();
		this.lastname = user.getLastname();
		this.role = user.getRoles().iterator().next().getName().name();
	}

	/**
	 * the constructor of UserDTO .
	 */
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter of adress .
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Getter of Password .
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of address .
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Setter of password .
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Getter of password .
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * getter of username .
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * getter of role .
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Getter of th user'phonenumber 
	 * @return the username
	 */
	public String getUsername() {
		return phonenumber;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.phonenumber = username;
	}

}
