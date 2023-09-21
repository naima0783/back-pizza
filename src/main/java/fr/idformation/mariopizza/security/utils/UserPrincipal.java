package fr.idformation.mariopizza.security.utils;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public final class UserPrincipal implements UserDetails {

	private static final long serialVersionUID = 928073442559839991L;

	/**
	 * the user principal's username .
	 */
	private String username;
	/**
	 * the user principal's password .
	 */
	private String password;
	/**
	 * a boolean enabled if connexion.
	 */
	private boolean enabled;
	/**
	 * the authoriries .
	 */
	private Collection<? extends GrantedAuthority> authorities;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Setter of Authorities.
	 *
	 * @param pAuthorities
	 */
	public void setAuthorities(final Collection<? extends GrantedAuthority> pAuthorities) {
		this.authorities = pAuthorities;
	}

	/**
	 * Setter of Enabled.
	 *
	 * @param pEnabled enabled
	 */
	public void setEnabled(final boolean pEnabled) {
		this.enabled = pEnabled;
	}

	/**
	 * Setter of password .
	 *
	 * @param pPassword
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * Setter of username .
	 *
	 * @param pUsername
	 */
	public void setUsername(final String pUsername) {
		this.username = pUsername;
	}
}
