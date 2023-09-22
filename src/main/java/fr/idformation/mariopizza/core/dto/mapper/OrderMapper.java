package fr.idformation.mariopizza.core.dto.mapper;

import fr.idformation.mariopizza.core.domain.Order;
import fr.idformation.mariopizza.core.dto.OrderDTO;
import fr.idformation.mariopizza.security.utils.UserMapper;

public class OrderMapper {

	/**
	 * transform a dto to an order.
	 *
	 * @param order the orderDTO
	 * @return the order
	 */
	public static Order dtoToOrder(final OrderDTO order) {
		return dtoToOrder(order, true);
	}

	/**
	 * transform an Order's dto to an Entity.
	 *
	 * @param addOrderLine the boolan if add or not
	 * @param dto          the orderDTO
	 * @return the order
	 */
	public static Order dtoToOrder(final OrderDTO dto, final boolean addOrderLine) {
		Order order = null;

		if (dto != null) {
			order = new Order();
			order.setDate(dto.getDate());
			order.setUser(UserMapper.dtoToEntity(dto.getUser()));
			order.setTotal(dto.getTotal());

			if (addOrderLine) {
				order.setOrderlines(OrderlineMapper.dtoToOrderLines(dto.getOrderlines()));

			}

		}
		return order;
	}

}
