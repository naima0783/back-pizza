package fr.idformation.mariopizza;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.idformation.mariopizza.core.domain.Order;
import fr.idformation.mariopizza.core.dto.OrderDTO;
import fr.idformation.mariopizza.core.dto.OrderlineDTO;
import fr.idformation.mariopizza.core.dto.mapper.OrderMapper;
import fr.idformation.mariopizza.security.Dto.UserDto;

public class OrderMapperTest {
	
	@Test
    public void testDtoToOrderWithAddOrderLine() {
        // Setup
        UserDto userDto = new UserDto(); // Assuming UserDto has a default constructor
        List<OrderlineDTO> orderlineList = Collections.singletonList(new OrderlineDTO()); // Assuming OrderlineDTO has a default constructor
        OrderDTO dto = new OrderDTO();
        dto.setId(1L);
        dto.setUser(userDto);
        dto.setOrderline(orderlineList);
        dto.setDate("2023-09-20");
        dto.setTotal(150.0);

        // Exercise
        Order order = OrderMapper.dtoToOrder(dto);

        // Verify
        assertThat(order).isNotNull();
        assertThat(order.getId()).isEqualTo(dto.getId());
        assertThat(order.getDate()).isEqualTo(dto.getDate());
        assertThat(order.getTotal()).isEqualTo(dto.getTotal());
        // Add more assertions as needed

        // Test with null input
        assertThat(OrderMapper.dtoToOrder(null)).isNull();
    }

    @Test
    public void testDtoToOrderWithoutAddOrderLine() {
        UserDto userDto = new UserDto(); // Assuming UserDto has a default constructor

    	 OrderDTO dto = new OrderDTO();
         dto.setId(1L);
         dto.setUser(userDto);
         dto.setDate("2023-09-20");
         dto.setTotal(150.0);
         
        Order order = OrderMapper.dtoToOrder(dto, false);

        // Verify
        assertThat(order).isNotNull();
        assertThat(order.getId()).isEqualTo(dto.getId());
        assertThat(order.getDate()).isEqualTo(dto.getDate());
        assertThat(order.getTotal()).isEqualTo(dto.getTotal());
        
        // Test with null input
        assertThat(OrderMapper.dtoToOrder(null, false)).isNull();
    }

}
