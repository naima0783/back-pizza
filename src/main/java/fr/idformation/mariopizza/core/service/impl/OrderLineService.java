package fr.idformation.mariopizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.mariopizza.core.domain.OrderLine;
import fr.idformation.mariopizza.core.repository.IOrderLineRepository;
import fr.idformation.mariopizza.core.service.IOrderLineService;

@Service
public class OrderLineService implements IOrderLineService {

	/**
	 * the orderline's repository .
	 */
	@Autowired
	private IOrderLineRepository orderlineRepo;

	@Override
	public void save(final OrderLine orderline) {
		orderlineRepo.save(orderline);
	}

}
