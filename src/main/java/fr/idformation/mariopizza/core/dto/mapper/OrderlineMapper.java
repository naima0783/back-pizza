package fr.idformation.mariopizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.mariopizza.core.domain.OrderLine;
import fr.idformation.mariopizza.core.dto.OrderlineDTO;

public class OrderlineMapper {

	/**
	 * transform from an orderline the college.
	 *
	 * @param dto the dto to transfor
	 * @return the orderLine
	 */
	public static OrderLine dtoToOrderLine(final OrderlineDTO dto) {
		OrderLine entity = null;

		if (dto != null) {
			entity = new OrderLine();

			entity.setId(dto.getId());
			entity.setPizza(PizzaMapper.dtoToPizza(dto.getPizza()));
			entity.setOrder(OrderMapper.dtoToOrder(dto.getOrder(), false));

		}

		return entity;
	}

	/**
	 * transform a list of orderlineDTO to a list of orderline. *
	 *
	 * @param orderlines the orderlines's DTO
	 * @return the list of orderLine
	 */
	public static List<OrderLine> dtoToOrderLines(final List<OrderlineDTO> orderlines) {
		List<OrderLine> dtos = null;

		dtos = new ArrayList<OrderLine>();
		for (OrderlineDTO orderline : orderlines) {
			dtos.add(dtoToOrderLine(orderline));

		}

		return dtos;

	}

}
