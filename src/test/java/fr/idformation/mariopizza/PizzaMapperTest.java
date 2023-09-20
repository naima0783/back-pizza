package fr.idformation.mariopizza;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

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

	
	
	@Test
    public void testPizzasToDtos() {
        // Setup
        Pizza pizza1 = new Pizza() ;
        pizza1.setId((long) 1);
        pizza1.setName("Margherita");
		pizza1.setDescription("tomate");
		pizza1.setPrice(10.0);
		pizza1.setImage("image1.jpg" );
        Pizza pizza2 = new Pizza() ;
        pizza1.setId((long) 2);
        pizza1.setName("4 fromage");
		pizza1.setDescription("tomate, fromage");
		pizza1.setPrice(12.0);
		pizza1.setImage("image2.jpg" );
		
        List<Pizza> pizzas = Arrays.asList(pizza1, pizza2);

        List<PizzaDTO> dtos = PizzaMapper.pizzasToDtos(pizzas);

        assertThat(dtos).isNotNull();
        assertThat(dtos).hasSize(2);
        assertThat(dtos.get(0).getName()).isEqualTo(pizza1.getName());
        assertThat(dtos.get(1).getDescription()).isEqualTo(pizza2.getDescription());
        assertThat(PizzaMapper.pizzasToDtos(null)).isNull();
    }

    @Test
    public void testPizzaToDto() {
        
    	Pizza pizza1 = new Pizza() ;
        pizza1.setId((long) 1);
        pizza1.setName("Margherita");
		pizza1.setDescription("tomate");
		pizza1.setPrice(10.0);
		pizza1.setImage("image1.jpg" );
       
        PizzaDTO dto = PizzaMapper.pizzaToDto(pizza1);

        assertThat(dto).isNotNull();
        assertThat(dto.getName()).isEqualTo(pizza1.getName());
        assertThat(dto.getDescription()).isEqualTo(pizza1.getDescription());
        assertThat(PizzaMapper.pizzasToDtos(null)).isNull();
    }
    
    @Test
    public void testDtoToPizza() {
        // Setup
        PizzaDTO dto = new PizzaDTO() ;
        dto.setId((long) 2);
        dto.setName("4 fromage");
		dto.setDescription("tomate, fromage");
		dto.setPrice(12.0);
		dto.setImage("image2.jpg" );
		
        Pizza pizza = PizzaMapper.dtoToPizza(dto);

        // Verify
        assertThat(pizza).isNotNull();
        assertThat(pizza.getName()).isEqualTo(dto.getName());
        assertThat(pizza.getDescription()).isEqualTo(dto.getDescription());

        assertThat(PizzaMapper.dtoToPizza(null)).isNull();
    }
    

  

}
