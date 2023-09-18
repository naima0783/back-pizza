package fr.idformation.mariopizza.core.service;

import fr.idformation.mariopizza.core.domain.Order;

public interface IOrderService {

	/**
	 * save the order in params.
	 *
	 * @param order the order
	 */
	void save(Order order);

}
