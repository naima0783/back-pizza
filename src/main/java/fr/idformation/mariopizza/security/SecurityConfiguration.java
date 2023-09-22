package fr.idformation.mariopizza.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import fr.idformation.mariopizza.security.jwt.JwtAuthenticationFilter;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
public class SecurityConfiguration {

	/** import the userdetailservice. */
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationManager authenticationManager() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(new BCryptPasswordEncoder());

		return new ProviderManager(authProvider);
	}

	@Bean
	public SecurityFilterChain filterChain(final HttpSecurity http) throws Exception {

		http.cors(Customizer.withDefaults());
		http.csrf((csrf) -> csrf.disable());

		http.exceptionHandling((exceptionHandling) -> exceptionHandling.authenticationEntryPoint((req, res, ex) -> res
				.sendError(HttpServletResponse.SC_UNAUTHORIZED, "UNAUTHORIZED : " + ex.getMessage())));

		http.sessionManagement((session) -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

		// set required security based on request
		http.authorizeHttpRequests(req -> req.requestMatchers("/auth/**").permitAll());
		http.authorizeHttpRequests(req -> req.anyRequest().authenticated());
	
		return http.build();
	}

	@Bean
	public JwtAuthenticationFilter jwtAuthenticationFilter() {
		return new JwtAuthenticationFilter();
	}

}
