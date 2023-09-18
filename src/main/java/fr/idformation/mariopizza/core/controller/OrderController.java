package fr.idformation.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.mariopizza.MariopizzaApplication;
import fr.idformation.mariopizza.core.dto.OrderDTO;
import fr.idformation.mariopizza.core.dto.mapper.OrderMapper;
import fr.idformation.mariopizza.core.service.impl.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = { "http://192.168.1.117:8081",
		"http://192.168.1.117:8081" }, maxAge = MariopizzaApplication.AGE_MAX)
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
			orderService.save(OrderMapper.dtoToOrder(order));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
