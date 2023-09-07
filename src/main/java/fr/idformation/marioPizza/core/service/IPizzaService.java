package fr.idformation.marioPizza.core.service;

import java.util.List;

import fr.idformation.marioPizza.core.domain.Pizza;

public interface IPizzaService {

	/**
	 * service to get of all the pizza.
	 *
	 * @return all the pizza
	 */
	List<Pizza> getAll();

	/**
	 * service to get of one pizza.
	 *
	 * @param id one pizza's id
	 * @return the pizza
	 */
	Pizza getOne(Long id);

}
