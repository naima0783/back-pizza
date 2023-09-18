package fr.idformation.mariopizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.mariopizza.core.domain.Order;
import fr.idformation.mariopizza.core.repository.IOrderRepository;
import fr.idformation.mariopizza.core.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	/**
	 * the order repository .
	 */
	@Autowired
	private IOrderRepository orderRepo;

	@Override
	public void save(final Order order) {
		orderRepo.save(order);
	}

}
