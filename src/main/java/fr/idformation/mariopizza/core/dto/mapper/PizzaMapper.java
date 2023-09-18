package fr.idformation.mariopizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.mariopizza.core.domain.Pizza;
import fr.idformation.mariopizza.core.dto.PizzaDTO;

public class PizzaMapper {

	/**
	 * transform a list of pizza to a list of dto's pizza.
	 *
	 * @param all the pizza
	 * @return the dto's pizza
	 */
	public static List<PizzaDTO> pizzasToDtos(final List<Pizza> all) {
		List<PizzaDTO> dtos = null;

		if (all != null) {
			dtos = new ArrayList<>();

			for (Pizza pizza : all) {
				dtos.add(pizzaToDto(pizza));
			}
		}

		return dtos;
	}

	/**
	 * transform a pizza to a dto's pizza.
	 *
	 * @param pizza the pizza.
	 * @return the dto's pizza.
	 */
	public static PizzaDTO pizzaToDto(final Pizza pizza) {
		PizzaDTO dto = null;

		if (pizza != null) {
			dto = new PizzaDTO(pizza);

		}

		return dto;
	}

	/**
	 * transform a dto to a pizza .
	 *
	 * @param dto the dto
	 * @return the pizza
	 */
	public static Pizza dtoToPizz(final PizzaDTO dto) {
		Pizza pizza = null;

		if (dto != null) {
			pizza = new Pizza();
			pizza.setId(dto.getId());

			pizza.setName(dto.getName());
			pizza.setDescription(dto.getDescription());
			pizza.setImage(dto.getImage());
			pizza.setPrice(dto.getPrice());

		}
		return pizza;

	}

}
