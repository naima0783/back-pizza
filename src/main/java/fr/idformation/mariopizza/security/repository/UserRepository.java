package fr.idformation.mariopizza.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.mariopizza.security.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Get an user by his phonenumber .
	 *
	 * @param username the phonenumber
	 * @return the user
	 */
	Optional<User> findByPhonenumber(String username);

}
