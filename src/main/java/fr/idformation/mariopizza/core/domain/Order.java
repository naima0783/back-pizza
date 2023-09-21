package fr.idformation.mariopizza.core.domain;

import java.util.List;

import fr.idformation.mariopizza.security.models.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

	/**
	 * id of the order.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * order's user's id.
	 */
	@ManyToOne
	@JoinColumn(name = "usr_id")
	private User user;

	/**
	 * order's date.
	 */
	@Column(name = "date")
	private String date;

	/**
	 * list of all the order's orderline.
	 */
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderLine> orderlines;

	/**
	 * order's total.
	 */
	@Column(name = "total_amount")
	private double total;

	/**
	 * the initializer of the user .
	 *
	 * @param pId    the id
	 * @param pUser  the order's user
	 * @param pDate  the order's date
	 * @param pTotal the order's total
	 */
	public Order(final Long pId, final User pUser, final String pDate, final Float pTotal) {
		super();
		this.id = pId;
		this.user = pUser;
		this.date = pDate;
		this.total = pTotal;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param pUser the user to set
	 */
	public void setUser(final User pUser) {
		this.user = pUser;
	}

	/**
	 * the initializer of the user .
	 */
	public Order() {
		super();
	}

	/**
	 * getter of the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * getter of order's date .
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Getter of total .
	 *
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

	/**
	 * @return the orderlines
	 */
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}

	/**
	 * @param pOrderlines the orderlines to set
	 */
	public void setOrderlines(final List<OrderLine> pOrderlines) {
		this.orderlines = pOrderlines;
	}

}
