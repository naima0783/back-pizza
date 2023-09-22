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
@RequestMapping("/orderss")
@CrossOrigin(origins = { "http://localhost:3000", "http://192.168.1.114:8081", "http://172.20.10.2:8081",
		"127.0.0.1:8080" }, maxAge = MariopizzaApplication.AGE_MAX)
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
			orderService.save(OrderMapper.dtoToOrder(order, true));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
