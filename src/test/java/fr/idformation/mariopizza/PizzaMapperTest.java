package fr.idformation.mariopizza;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import fr.idformation.mariopizza.core.domain.Pizza;
import fr.idformation.mariopizza.core.dto.PizzaDTO;
import fr.idformation.mariopizza.core.dto.mapper.PizzaMapper;

public class PizzaMapperTest {
	/**
	 * Tests if a null object turns into a null dto.
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

	/**
	 * Test to test transformation of a pizza to a pizzaDTO.
	 */
	@Test
	public void testEntityToDto() {
		// given
		final long id = 23;
		final double price = 12.45;
		Pizza pizza = new Pizza();
		pizza.setName("4 fromage");
		pizza.setId(id);
		pizza.setDescription("tomate, frommage,thon");
		pizza.setPrice(price);

		PizzaDTO dto = PizzaMapper.pizzaToDto(pizza);

		assertThat(dto.getName()).isEqualTo("4 fromage");
		assertThat(dto.getDescription()).isEqualTo("tomate, frommage,thon");
		assertThat(dto.getPrice()).isEqualTo(price);
		assertThat(dto.getId()).isEqualTo(id);
		Assert.notNull(dto, "dto should be non null if the entity is not null");

	}

}
