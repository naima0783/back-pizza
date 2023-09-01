package fr.idformation.marioPizza.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.marioPizza.core.dto.PizzaDTO;
import fr.idformation.marioPizza.core.dto.mapper.PizzaMapper;
import fr.idformation.marioPizza.core.service.impl.PizzaService;

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class PizzaController {

	@Autowired
	private PizzaService pizzaService;

	@GetMapping("/all")
	// @PreAuthorize("hasAnyRole( 'ROLE_ADMIN')")
	public List<PizzaDTO> getAll() {
		return PizzaMapper.pizzasToDtos(pizzaService.getAll());
	}

}
