package fr.idformation.mario.s_pizza;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import fr.idformation.marioPizza.core.domain.Pizza;
import fr.idformation.marioPizza.core.dto.PizzaDTO;
import fr.idformation.marioPizza.core.dto.mapper.PizzaMapper;

public class PizzaMapperTest {
	/**
	 * Tests if a null object turns into a null dto
	 */
	@Test
	public void nullToDto() {
		// given
		Pizza pizza = null;

		// when
		PizzaDTO dto = PizzaMapper.pizzaToDto(pizza);

		// then
		Assert.isNull(dto, "dto should be null when entity is null");
	}

	@Test
	public void testEntityToDto() {
		// given
		Pizza pizza = new Pizza();
		pizza.setName("4 fromage");
		pizza.setId((long) 23);
		pizza.setDescription("tomate, frommage,thon");
		pizza.setPrice(12.45);

		PizzaDTO dto = PizzaMapper.pizzaToDto(pizza);

		assertThat(dto.getName()).isEqualTo("4 fromage");
		assertThat(dto.getDescription()).isEqualTo("tomate, frommage,thon");
		assertThat(dto.getPrice()).isEqualTo(12.45);
		assertThat(dto.getId()).isEqualTo(23);
		Assert.notNull(dto, "dto should be non null if the entity is not null");

	}

}
