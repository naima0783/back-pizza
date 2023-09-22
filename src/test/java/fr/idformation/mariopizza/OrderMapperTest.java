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
/**
 * test of orderMapper
 */
public class OrderMapperTest {
	
	/**
	 * test Dto To Order With Add OrderLine .
	 * 	 */
	@Test
    public void testDtoToOrderWithAddOrderLine() {
        // Setup
        UserDto userDto = new UserDto(); // Assuming UserDto has a default constructor
        List<OrderlineDTO> orderlineList = Collections.singletonList(new OrderlineDTO()); // Assuming OrderlineDTO has a default constructor
        OrderDTO dto = new OrderDTO();
        dto.setId(1L);
        dto.setUser(userDto);
        dto.setOrderlines(orderlineList);
        dto.setDate("2023-09-20");
        dto.setTotal(150.0);

        Order order = OrderMapper.dtoToOrder(dto);

        assertThat(order).isNotNull();
        assertThat(order.getDate()).isEqualTo(dto.getDate());
        assertThat(order.getTotal()).isEqualTo(dto.getTotal());
        assertThat(order.getUser().getId()).isEqualTo(userDto.getId()) ;

        assertThat(OrderMapper.dtoToOrder(null)).isNull();
    }

	/**
	 * test Dto To Order Without Add OrderLine .
	 *  */
    @Test
    public void testDtoToOrderWithoutAddOrderLine() {
        UserDto userDto = new UserDto(); // Assuming UserDto has a default constructor

    	 OrderDTO dto = new OrderDTO();
         dto.setId(1L);
         dto.setUser(userDto);
         dto.setDate("2023-09-20");
         dto.setTotal(150.0);
         
        Order order = OrderMapper.dtoToOrder(dto, false);

        assertThat(order).isNotNull();
        assertThat(order.getDate()).isEqualTo(dto.getDate());
        assertThat(order.getUser().getId()).isEqualTo(userDto.getId()) ;
        assertThat(order.getTotal()).isEqualTo(dto.getTotal());
        
        assertThat(OrderMapper.dtoToOrder(null, false)).isNull();
    }

}
