package fr.idformation.mariopizza.core.dto;

import fr.idformation.mariopizza.core.domain.OrderLine;

public class OrderlineDTO {
	/**
	 * id of the orderLine.
	 */
	private Long id;

	/**
	 * order's id.
	 */
	private OrderDTO order;

	/**
	 * order's pizza.
	 */
	private PizzaDTO pizza;

	/**
	 * order's quantity.
	 */
	private int quantite;

	/**
	 * 
	 */
	public OrderlineDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param order
	 * @param pizza
	 * @param quantite
	 */
	public OrderlineDTO(OrderLine orderline) {
		super();
		this.id = orderline.getId();

		this.quantite = orderline.getQuantite();

		this.id = orderline.getId();

	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the order
	 */
	public OrderDTO getOrder() {
		return order;
	}

	/**
	 * @return the pizza
	 */
	public PizzaDTO getPizza() {
		return pizza;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	/**
	 * @param pizza the pizza to set
	 */
	public void setPizza(PizzaDTO pizza) {
		this.pizza = pizza;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
