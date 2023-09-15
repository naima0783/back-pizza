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
	 * @param user the user to set
	 */
	public void setUser(UserDto user) {
		this.user = user;
	}

	/**
	 * 
	 */
	private List<OrderlineDTO> orderline;

	/**
	 * @return the orderline
	 */
	public List<OrderlineDTO> getOrderline() {
		return orderline;
	}

	/**
	 * @param orderline the orderline to set
	 */
	public void setOrderline(List<OrderlineDTO> orderline) {
		this.orderline = orderline;
	}

	/**
	 * order's date.
	 */
	private String date;

	/**
	 * order's total.
	 */
	private Float total;

	/**
	 * 
	 */
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param user
	 * @param date
	 * @param total
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
	public Float getTotal() {
		return total;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Float total) {
		this.total = total;
	}

}
