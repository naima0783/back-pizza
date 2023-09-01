package fr.idformation.marioPizza.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.marioPizza.security.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByPhonenumber(String phonenumber);

}
