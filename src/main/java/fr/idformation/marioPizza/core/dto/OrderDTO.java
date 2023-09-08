package fr.idformation.marioPizza.core.dto;

import fr.idformation.marioPizza.core.domain.Order;

public class OrderDTO {
	/**
	 * the order's id .
	 */
	private Long id;

	/**
	 * order's user's id.
	 */

	private ClientDTO user;

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
	 * @return the user
	 */
	public ClientDTO getUser() {
		return user;
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
	 * @param user the user to set
	 */
	public void setUser(ClientDTO user) {
		this.user = user;
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
