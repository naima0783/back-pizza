package fr.idformation.marioPizza.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.marioPizza.Application;
import fr.idformation.marioPizza.core.dto.PizzaDTO;
import fr.idformation.marioPizza.core.dto.mapper.PizzaMapper;
import fr.idformation.marioPizza.core.service.impl.PizzaService;

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:3000", maxAge = Application.MAX)
public class PizzaController {

	/**
	 * Pizza's service.
	 */
	@Autowired
	private PizzaService pizzaService;

	/**
	 * Getter of all the pizza.
	 *
	 * @return all the pizza
	 */
	@GetMapping("/all")
	public List<PizzaDTO> getAll() {
		return PizzaMapper.pizzasToDtos(pizzaService.getAll());
	}

}
