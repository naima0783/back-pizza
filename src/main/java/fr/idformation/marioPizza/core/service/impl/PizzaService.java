/**
 * 
 */
package fr.idformation.marioPizza.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.marioPizza.core.domain.Pizza;
import fr.idformation.marioPizza.core.repository.IPizzaRepository;
import fr.idformation.marioPizza.core.service.IPizzaService;

/**
 * @author Naima
 *
 */
@Service
public class PizzaService implements IPizzaService {

	/**
	 * Pizza's repository.
	 */
	@Autowired
	private IPizzaRepository pizzaRepo;

	@Override
	public List<Pizza> getAll() {
		return pizzaRepo.findAll();
	}

	@Override
	public Pizza getOne(Long id) {
		return pizzaRepo.findById(id).get();

	}

}
