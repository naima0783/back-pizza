package fr.idformation.mariopizza.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.idformation.mariopizza.security.models.User;
import fr.idformation.mariopizza.security.repository.UserRepository;
import fr.idformation.mariopizza.security.utils.UserMapper;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	/** import the userRepository. */
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		User user = userRepository.findByPhonenumber(username)
				.orElseThrow(() -> new UsernameNotFoundException("User NOT Found"));
		return UserMapper.userToPrincipal(user);
	}

	/**
	 *
	 * @param username a username
	 * @return the detail of the given user
	 * @throws UsernameNotFoundException
	 */
	public User loadUserDetails(final String username) throws UsernameNotFoundException {
		User user = userRepository.findByPhonenumber(username)
				.orElseThrow(() -> new UsernameNotFoundException("User NOT Found"));
		return user;
	}
}
