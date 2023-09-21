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
	 * the initializer of orderline's dto .
	 */
	public OrderlineDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pPizza
	 * @param pQuantite
	 */
	public OrderlineDTO(final PizzaDTO pPizza, final int pQuantite) {
		super();
		this.pizza = pPizza;
		this.quantite = pQuantite;
	}

	/**
	 * the initializer of orderline's dto.
	 *
	 * @param orderline the orderline to transform to dto .
	 */
	public OrderlineDTO(final OrderLine orderline) {
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
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pOrder the order to set
	 */
	public void setOrder(final OrderDTO pOrder) {
		this.order = pOrder;
	}

	/**
	 * @param pPizza the pizza to set
	 */
	public void setPizza(final PizzaDTO pPizza) {
		this.pizza = pPizza;
	}

	/**
	 * @param pQuantite the quantite to set
	 */
	public void setQuantite(final int pQuantite) {
		this.quantite = pQuantite;
	}
}
