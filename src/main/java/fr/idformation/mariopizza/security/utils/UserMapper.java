package fr.idformation.mariopizza.security.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import fr.idformation.mariopizza.security.Dto.UserDto;
import fr.idformation.mariopizza.security.models.User;

public class UserMapper {

	/**
	 * Map a user into userPrincipal.
	 *
	 * @param user a user to map
	 * @return a userPrincipal
	 */
	public static UserPrincipal userToPrincipal(final User user) {
		UserPrincipal userp = new UserPrincipal();
		List<SimpleGrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName())).collect(Collectors.toList());

		userp.setUsername(user.getUsername());
		userp.setPassword(user.getPassword());
		userp.setEnabled(true);
		userp.setAuthorities(authorities);
		return userp;
	}

	/**
	 * transform a userDTO to an user.
	 *
	 * @param dto the userDtop
	 * @return the user
	 */
	public static User dtoToEntity(final UserDto dto) {
		User client = null;

		if (dto != null) {
			client = new User();
			client.setUsername(dto.getUsername());

			client.setFirstname(dto.getFirstname());
			client.setLastname(dto.getLastname());
			client.setPassword(dto.getPassword());
			client.setAddress(dto.getAddress());

		}
		return client;
	}

}
