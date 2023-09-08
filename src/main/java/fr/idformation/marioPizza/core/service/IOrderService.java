package fr.idformation.marioPizza.core.service;

import fr.idformation.marioPizza.core.domain.Order;

public interface IOrderService {

	/**
	 * save a new order.
	 *
	 * @param order the order
	 * @return the new order
	 */
	Order save(Order order);
}
