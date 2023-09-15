package fr.idformation.mariopizza.core.service;

import java.util.List;

import fr.idformation.mariopizza.core.domain.Pizza;

public interface IPizzaService {
	/**
	 * service to get of all the pizza.
	 *
	 * @return all the pizza
	 */
	List<Pizza> getAll();

}
