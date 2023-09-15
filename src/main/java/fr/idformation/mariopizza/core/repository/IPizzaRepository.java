package fr.idformation.mariopizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.mariopizza.core.domain.Pizza;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Long> {

}
