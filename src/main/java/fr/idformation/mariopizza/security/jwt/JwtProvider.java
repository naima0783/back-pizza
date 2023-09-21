package fr.idformation.mariopizza.security.jwt;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import fr.idformation.mariopizza.security.utils.UserPrincipal;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtProvider {
	/**
	 * the jwt secret key .
	 */
	@Value("${app.jwtSecretKey}")
	private String secret;

	/**
	 * the jwt expiration .
	 */
	@Value("${app.jwtExpirationInMs}")
	private int jwtExpirationInMs;

	/**
	 * the jwt key .
	 */
	private Key key;

	/**
	 * the logger.
	 */
	protected final Log logger = LogFactory.getLog(getClass());

	/**
	 * the generator of Token .
	 *
	 * @param authentication the authentification
	 * @return the token
	 */
	public String generateToken(final Authentication authentication) {
		UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
		Date now = new Date();
		Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

		return Jwts.builder().setSubject(userPrincipal.getUsername()).setIssuedAt(new Date()).setExpiration(expiryDate)
				.signWith(getSigningKey(), SignatureAlgorithm.HS512).compact();
	}

	/**
	 * Getter of the Expiration Date .
	 *
	 * @param token the token
	 * @return the expiration's date
	 */
	public Date getExpiryDate(final String token) {
		Claims claims = Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody();
		return claims.getExpiration();
	}

	private Key getSigningKey() {
		if (key == null) {
			byte[] keyBytes = Base64.getUrlDecoder().decode(this.secret);
			key = Keys.hmacShaKeyFor(keyBytes);
		}
		return key;
	}

	/**
	 * Getter of user's username from JWt.
	 *
	 * @param token the token
	 * @return the user's username
	 */
	public String getUserUsernameFromJWT(final String token) {
		Claims claims = Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody();
		return claims.getSubject();
	}

	/**
	 * Say if the token is valide.
	 *
	 * @param authToken the token
	 * @return true if token valid
	 */
	public boolean validateToken(final String authToken) {
		try {
			Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(authToken);
			return true;
		} catch (Exception ex) {
			logger.error(ex);
		}
		return false;
	}
}
