package fr.idformation.mariopizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.mariopizza.core.domain.Order;
import fr.idformation.mariopizza.core.repository.IOrderRepository;
import fr.idformation.mariopizza.core.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository orderRepo;

	@Override
	public void save(Order order) {
		orderRepo.save(order);
	}

}
