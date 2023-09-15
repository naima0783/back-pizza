package fr.idformation.mariopizza.core.dto.mapper;

import fr.idformation.mariopizza.core.domain.Order;
import fr.idformation.mariopizza.core.dto.OrderDTO;
import fr.idformation.mariopizza.security.utils.UserMapper;

public class OrderMapper {

	public static Order dtoToOrder(OrderDTO order) {
		return dtoToOrder(order, true);
	}

	/**
	 * transform an Order's dto to an Entity.
	 *
	 * @param dto the orderDTO
	 * @return the order
	 */
	public static Order dtoToOrder(final OrderDTO dto, boolean addOrderLine) {
		Order order = null;

		if (dto != null) {
			order = new Order();
			order.setId(dto.getId());
			order.setDate(dto.getDate());
			order.setUser(UserMapper.dtoToEntity(dto.getUser()));
			order.setTotal(dto.getTotal());

		}
		return order;
	}

}
