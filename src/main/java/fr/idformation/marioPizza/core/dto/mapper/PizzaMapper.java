package fr.idformation.marioPizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.gestionClient.core.dto.CustomerDTO;
import fr.idformation.gestionClient.core.dto.mapper.ContactMapper;
import fr.idformation.marioPizza.core.domain.Pizza;
import fr.idformation.marioPizza.core.dto.PizzaDTO;

public class PizzaMapper {

	public static List<PizzaDTO> pizzasToDtos(List<Pizza> all) {
		List<PizzaDTO> dtos = null;

		if (all != null) {
			dtos = new ArrayList<>();

			for (Pizza pizza : all) {
				dtos.add(pizzaToDto(pizza));
			}
		}

		return dtos;
	}

	private static PizzaDTO pizzaToDto(Pizza pizza) {
		PizzaDTO dto = null;

		if (pizza != null) {
			dto = new PizzaDTO(pizza);

			
		}

		return dto;
	}
	}

}
