package fr.idformation.mariopizza.core.dto;

import java.util.List;

import fr.idformation.mariopizza.core.domain.Order;
import fr.idformation.mariopizza.security.Dto.UserDto;

public class OrderDTO {
	/**
	 * the order's id .
	 */
	private Long id;

	/**
	 * order's user's id.
	 */

	private UserDto user;

	/**
	 * @return the user
	 */
	public UserDto getUser() {
		return user;
	}

	/**
	 * @param pUser the user to set
	 */
	public void setUser(final UserDto pUser) {
		this.user = pUser;
	}

	/**
	 * the orderdto's orderlinedto .
	 */
	private List<OrderlineDTO> orderline;

	/**
	 * @return the orderline
	 */
	public List<OrderlineDTO> getOrderline() {
		return orderline;
	}

	/**
	 * @param pOrderline the orderline to set
	 */
	public void setOrderline(final List<OrderlineDTO> pOrderline) {
		this.orderline = pOrderline;
	}

	/**
	 * order's date.
	 */
	private String date;

	/**
	 * order's total.
	 */
	private double total;

	/**
	 * the initializer of orderdto .
	 */
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * initilizer of orderDTO from an order .
	 *
	 * @param order the order
	 */
	public OrderDTO(final Order order) {
		super();
		this.date = order.getDate();
		this.total = order.getTotal();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pDate the date to set
	 */
	public void setDate(final String pDate) {
		this.date = pDate;
	}

	/**
	 * @param d the total to set
	 */
	public void setTotal(final double d) {
		this.total = d;
	}

}
