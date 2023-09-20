package fr.idformation.mariopizza.security.Dto;

import fr.idformation.mariopizza.security.models.User;

public class UserDto {

	private String phonenumber;
	private String firstname;
	private String lastname;
	private String address;
	private String password;
	private String role;

	public UserDto(User user) {
		this.phonenumber = user.getUsername();
		this.firstname = user.getFirstname();
		this.lastname = user.getLastname();
		this.role = user.getRoles().iterator().next().getName().name();
	}

	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
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
