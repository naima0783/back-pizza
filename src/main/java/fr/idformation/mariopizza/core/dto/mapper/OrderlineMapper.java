package fr.idformation.mariopizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.mariopizza.core.domain.OrderLine;
import fr.idformation.mariopizza.core.dto.OrderlineDTO;

public class OrderlineMapper {

	public static OrderLine dtoToOrderLine(OrderlineDTO dto) {
		OrderLine entity = null;

		if (dto != null) {
			entity = new OrderLine();
			entity.setId(dto.getId());
			entity.setPizza(PizzaMapper.dtoToPizz(dto.getPizza()));
			entity.setOrder(OrderMapper.dtoToOrder(dto.getOrder(), false));

		}

		return entity;
	}

	public static List<OrderLine> dtoToOrderLine(List<OrderlineDTO> orderlines, boolean b) {
		List<OrderLine> dtos = null;

		if (orderlines != null) {
			dtos = new ArrayList<OrderLine>();
			for (OrderlineDTO orderline : orderlines) {
				dtos.add(dtoToOrderLine(orderline));
			}
		}

		return dtos;

	}

}
