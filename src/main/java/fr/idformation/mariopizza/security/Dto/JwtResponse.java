package fr.idformation.mariopizza.security.Dto;

import java.util.Date;

public class JwtResponse {

	/*
	 * th jwt .
	 */
	private String jwt;
	/*
	 * the expiration's date of jwt .
	 */
	private Date expiration;

	/*
	 * the user in JWT .
	 */
	private UserDto user;

	/**
	 *the Jwt response constructor ..
	 */
	public JwtResponse() {
		super();
	}

	/**
	 *the JXT response constructor.
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
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}

	/**
	 * Getter of jwt's user .
	 * @return the user
	 */
	public UserDto getUser() {
		return user;
	}

	/**
	 * Setter of jwt's expiration .
	 * @param expiration the expiration to set
	 */
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	/**
	 * Setter of Jwt.
	 * @param jwt the jwt to set
	 */
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	/**
	 * Setter of jwt's User .
	 * @param user the user to set
	 */
	public void setUser(UserDto user) {
		this.user = user;
	}

}
