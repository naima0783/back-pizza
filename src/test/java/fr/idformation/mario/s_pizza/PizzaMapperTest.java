package fr.idformation.mario.s_pizza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.idformation.marioPizza.core.dto.mapper.PizzaMapper;
import io.jsonwebtoken.lang.Assert;

@SpringBootTest
public class PizzaMapperTest {
	/**
	 * Tests the constructor for the mapper.
	 */
	@Test
	public void defaultConstructor() {
		// given

		// when
		PizzaMapper mapper = new PizzaMapper();

		// then
		Assert.notNull(mapper, "the constructor returned a null object");
		Assert.isTrue(mapper.getClass().equals(PizzaMapper.class), "the constructor returned a null object");
	}

}
