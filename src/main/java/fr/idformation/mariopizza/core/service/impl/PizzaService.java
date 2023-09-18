package fr.idformation.mariopizza.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.mariopizza.core.domain.Pizza;
import fr.idformation.mariopizza.core.repository.IPizzaRepository;
import fr.idformation.mariopizza.core.service.IPizzaService;

@Service
public class PizzaService implements IPizzaService {

	/**
	 * the pizza's repository .
	 */
	@Autowired
	private IPizzaRepository pizzaRepo;

	@Override
	public List<Pizza> getAll() {
		return pizzaRepo.findAll();

	}

}
