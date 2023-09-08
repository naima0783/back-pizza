package fr.idformation.marioPizza.core.dto.mapper;

import fr.idformation.marioPizza.core.domain.Order;
import fr.idformation.marioPizza.core.dto.OrderDTO;

public class OrderMapper {

	/**
	 * Turn an Order into a ORDERDTO, the client is returned by default.
	 *
	 * @param order the order
	 * @return the order turned into its OrderDTO sibling
	 */
	public static OrderDTO orderToDto(Order order) {
		return orderToDto(order, true);
	}

	/**
	 * Turn a Order into a OrderDTO.
	 *
	 * @param order     the order
	 * @param addClient indicates if the client has to be added to the response
	 * @return the order turned into its OrderDTO
	 */
	public static OrderDTO orderToDto(Order order, boolean addClient) {
		OrderDTO dto = null;

		if (order != null) {
			dto = new OrderDTO(order);
			if (addClient) {
				// dto.setUser(ClientMapper.clientToDto(order.getUser(), false));

			}
		}

		return dto;
	}

	/**
	 * transform an Order's dto to an Entity.
	 *
	 * @param dto the orderDTO
	 * @return the order
	 */
	public static Order dtoToEntity(final OrderDTO dto) {
		Order order = null;

		if (dto != null) {
			order = new Order();
			order.setDate(dto.getDate());
			// order.setUser(ClientMapper.dtoToEntity(dto.getUser()));
			order.setTotal(dto.getTotal());

		}
		return order;
	}

}
