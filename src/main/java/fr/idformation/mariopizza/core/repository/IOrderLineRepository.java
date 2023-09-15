package fr.idformation.mariopizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.idformation.mariopizza.core.domain.OrderLine;

public interface IOrderLineRepository extends JpaRepository<OrderLine, Long> {

}
