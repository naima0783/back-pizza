package fr.idformation.mariopizza.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.mariopizza.security.Dto.JwtResponse;
import fr.idformation.mariopizza.security.Dto.LoginRequest;
import fr.idformation.mariopizza.security.Dto.UserDto;
import fr.idformation.mariopizza.security.jwt.JwtProvider;
import fr.idformation.mariopizza.security.models.User;
import fr.idformation.mariopizza.security.service.impl.UserDetailsServiceImpl;
import jakarta.validation.Valid;

/**
 * Classe permettant de gérer la sécurité.
 *
 * @author naima
 *
 */

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {  "http://172.20.10.2:8081"  }, maxAge = 3600)
public final class AuthController {

	/** token header to use in JWT. */
	@Value("${app.jwtTokenHeader}")
	private String tokenHeader;

	/** import authentication manager. */
	@Autowired
	private AuthenticationManager authenticationManager;

	/** import jwtprovider. */
	@Autowired
	private JwtProvider tokenProvider;

	/** import user service. */
	@Autowired
	private UserDetailsServiceImpl userService;

	/**
	 * The user's authentification mapping .
	 *
	 * @param request a login + password couple
	 * @return a response with the jwt
	 */
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody final LoginRequest request) {

		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = tokenProvider.generateToken(authentication);

		User user = userService.loadUserDetails(request.getUsername());

		return ResponseEntity
				.ok(new JwtResponse(tokenHeader + " " + jwt, tokenProvider.getExpiryDate(jwt), new UserDto(user)));
	}

//	/**
//	 *
//	 * @param username a username
//	 * @return the profile picture of the user
//	 * @throws SQLException
//	 */
//	@GetMapping(value = "/picture/{username}", produces = MediaType.IMAGE_PNG_VALUE)
//	public ResponseEntity<InputStreamResource> getPicture(@PathVariable("username") final String username)
//			throws SQLException {
//		User user = userService.loadUserDetails(username);
//
//		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG)
//				.body(new InputStreamResource(user.getPicture().getBinaryStream()));
//	}
}
