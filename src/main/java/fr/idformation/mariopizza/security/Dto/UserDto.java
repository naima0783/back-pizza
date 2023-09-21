package fr.idformation.mariopizza.security.Dto;

import fr.idformation.mariopizza.security.models.User;

public class UserDto {

	/**
	 * the user's phonenumber.
	 */
	private String phonenumber;

	/**
	 * the user's firstname.
	 */
	private String firstname;
	/**
	 * the user's lastname .
	 */
	private String lastname;
	/**
	 * the user's adress.
	 */
	private String address;

	/**
	 * the user's password.
	 */
	private String password;
	/**
	 * the user's role.
	 */
	private String role;

	/**
	 * initializer of user'DTO .
	 *
	 * @param user the user
	 */
	public UserDto(final User user) {
		this.phonenumber = user.getPhonenumber();
		this.firstname = user.getFirstname();
		this.lastname = user.getLastname();
		this.role = user.getRoles().iterator().next().getName().name();
	}

	/**
	 * initializer of user'DTO .
	 *
	 * @param pPhonenumber the phonenumber
	 * @param pFirstname   the user's first
	 * @param pLastname
	 * @param pAddress
	 * @param pPassword
	 */
	public UserDto(final String pPhonenumber, final String pFirstname, final String pLastname, final String pAddress,
			final String pPassword) {
		super();
		this.phonenumber = pPhonenumber;
		this.firstname = pFirstname;
		this.lastname = pLastname;
		this.address = pAddress;
		this.password = pPassword;
	}

	/**
	 * Initializer of user's DTO .
	 */
	public UserDto() {
		super();
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
	 * @param pAddress the address to set
	 */
	public void setAddress(final String pAddress) {
		this.address = pAddress;
	}

	/**
	 * @param pPassword the password to set
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
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
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param pFirstname the firstname to set
	 */
	public void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	/**
	 * @param pLastname the lastname to set
	 */
	public void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}

	/**
	 * @param pRole the role to set
	 */
	public void setRole(final String pRole) {
		this.role = pRole;
	}

	/**
	 * @param username the username to set
	 */
	public void setPhonenumber(final String username) {
		this.phonenumber = username;
	}

}
