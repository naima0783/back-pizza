package fr.idformation.mariopizza.core.service;

import fr.idformation.mariopizza.core.domain.OrderLine;

public interface IOrderLineService {

	/**
	 * Save the orderline in params .
	 *
	 * @param orderline the order line .
	 */
	void save(OrderLine orderline);

}
