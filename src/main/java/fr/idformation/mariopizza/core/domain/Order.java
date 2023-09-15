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

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderLine> orderlines;

	/**
	 * order's total.
	 */
	@Column(name = "total_amount")
	private Float total;

	/**
	 * @param id
	 * @param user
	 * @param date
	 * @param total
	 */
	public Order(Long id, User user, String date, Float total) {
		super();
		this.id = id;
		this.user = user;
		this.date = date;
		this.total = total;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 */
	public Order() {
		super();
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