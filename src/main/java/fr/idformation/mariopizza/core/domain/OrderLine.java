package fr.idformation.mariopizza.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_line")
public class OrderLine {

	/**
	 * id of the orderLine.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * order's id.
	 */
	@ManyToOne
	@JoinColumn(name = "ord_id")
	private Order order;

	/**
	 * order's pizza.
	 */
	@ManyToOne
	@JoinColumn(name = "piz_id")
	private Pizza pizza;

	/**
	 * order's quantity.
	 */
	@Column(name = "quantity")
	private int quantite;

	/**
	 * the initializer of orderliness .
	 */
	public OrderLine() {
		super();
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
	public Order getOrder() {
		return order;
	}

	/**
	 * @return the pizza
	 */
	public Pizza getPizza() {
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
	 * Setter of the order.
	 *
	 * @param pOrder the order to set
	 */
	public void setOrder(final Order pOrder) {
		this.order = pOrder;
	}

	/**
	 * setter of the pizza.
	 *
	 * @param pPizza the pizza to set
	 */
	public void setPizza(final Pizza pPizza) {
		this.pizza = pPizza;
	}

	/**
	 * @param pQuantite the quantite to set
	 */
	public void setQuantite(final int pQuantite) {
		this.quantite = pQuantite;
	}

}
