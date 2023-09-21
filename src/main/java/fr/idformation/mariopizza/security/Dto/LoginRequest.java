package fr.idformation.mariopizza.security.Dto;

public class LoginRequest {

	/**
	 * the user 's username .
	 */
	private String username;

	/**
	 * the user's password.
	 */
	private String password;

	/**
	 * the constructor of LoginRequest .
	 */
	public LoginRequest() {
		super();
	}

	/**
	 * Setter of Password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Getter of Username .
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter of Password .
	 *
	 * @param pPassword the password to set
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * @param pUsername the username to set
	 */
	public void setUsername(final String pUsername) {
		this.username = pUsername;
	}

}
