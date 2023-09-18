package fr.idformation.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.mariopizza.MariopizzaApplication;
import fr.idformation.mariopizza.core.dto.OrderlineDTO;
import fr.idformation.mariopizza.core.dto.mapper.OrderlineMapper;
import fr.idformation.mariopizza.core.service.impl.OrderLineService;

@RestController
@RequestMapping("/orderline")
@CrossOrigin(origins = { "http://localhost:3000", "http://192.168.1.117:8081" }, maxAge = MariopizzaApplication.AGE_MAX)
public class OrderLineController {

	/**
	 * order line's service.
	 */
	@Autowired
	private OrderLineService orderlineService;

	/**
	 * Creation of an order.
	 *
	 * @param orderline the order line
	 * @return true if succeed
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody final OrderlineDTO orderline) {
		try {
			orderlineService.save(OrderlineMapper.dtoToOrderLine(orderline));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
