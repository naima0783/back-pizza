package fr.idformation.marioPizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.marioPizza.Application;
import fr.idformation.marioPizza.core.dto.OrderDTO;
import fr.idformation.marioPizza.core.dto.mapper.OrderMapper;
import fr.idformation.marioPizza.core.service.impl.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:3000", maxAge = Application.MAX)
public class OrderController {

	/**
	 * order's service.
	 */
	@Autowired
	private OrderService orderService;

	/**
	 * Creation of an order.
	 *
	 * @param order the order
	 * @return true if succeed
	 */
	@PostMapping("/save")
	public boolean save(@Validated @RequestBody final OrderDTO order) {
		try {
			orderService.save(OrderMapper.dtoToEntity(order));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
