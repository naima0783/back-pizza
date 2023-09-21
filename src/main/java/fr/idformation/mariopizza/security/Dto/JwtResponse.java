package fr.idformation.mariopizza.security.Dto;

import java.util.Date;

public class JwtResponse {

	/**
	 * th jwt .
	 */
	private String jwt;
	/**
	 * the expiration's date of jwt .
	 */
	private Date expiration;

	/**
	 * the user in JWT .
	 */
	private UserDto user;

	/**
	 * the Jwt response constructor ..
	 */
	public JwtResponse() {
		super();
	}

	/**
	 * the JXT response constructor.
	 *
	 * @param pJwt        the jwt token
	 * @param pExpiration the expiration date of the jwt
	 * @param pUser       the logged user
	 */
	public JwtResponse(final String pJwt, final Date pExpiration, final UserDto pUser) {
		super();
		this.jwt = pJwt;
		this.expiration = pExpiration;
		this.user = pUser;
	}

	/**
	 * Getter of jwt's expiration .
	 *
	 * @return the expiration
	 */
	public Date getExpiration() {
		return expiration;
	}

	/**
	 * getter of jwtn.
	 *
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}

	/**
	 * Getter of jwt's user .
	 *
	 * @return the user
	 */
	public UserDto getUser() {
		return user;
	}

	/**
	 * Setter of jwt's expiration .
	 *
	 * @param pExpiration the expiration to set
	 */
	public void setExpiration(final Date pExpiration) {
		this.expiration = pExpiration;
	}

	/**
	 * Setter of Jwt.
	 *
	 * @param pJwt the jwt to set
	 */
	public void setJwt(final String pJwt) {
		this.jwt = pJwt;
	}

	/**
	 * Setter of jwt's User .
	 *
	 * @param pUser the user to set
	 */
	public void setUser(final UserDto pUser) {
		this.user = pUser;
	}

}
