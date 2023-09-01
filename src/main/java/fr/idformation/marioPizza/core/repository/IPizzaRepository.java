package fr.idformation.marioPizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.marioPizza.core.domain.Pizza;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Long> {

}
