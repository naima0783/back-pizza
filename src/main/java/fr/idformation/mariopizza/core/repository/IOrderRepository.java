package fr.idformation.mariopizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.idformation.mariopizza.core.domain.Order;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
