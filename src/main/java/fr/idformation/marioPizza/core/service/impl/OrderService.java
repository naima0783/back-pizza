package fr.idformation.marioPizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.marioPizza.core.domain.Order;
import fr.idformation.marioPizza.core.repository.IOrderRepository;
import fr.idformation.marioPizza.core.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository orderRepo;

	@Override
	public Order save(Order order) {
		return orderRepo.save(order);
	}

}