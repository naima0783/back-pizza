package fr.idformation.marioPizza.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	/**
	 * @ManyToOne
	 * @JoinColumn(name = "usr_id") private Client user;
	 **/
	/**
	 * order's date.
	 */
	@Column(name = "date")
	private String date;

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
	public Order(Long id, Client user, String date, Float total) {
		super();
		this.id = id;
		// this.user = user;
		this.date = date;
		this.total = total;
	}

	/**
	 * 
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the user
	 * 
	 *         public Client getUser() { return user; }
	 */

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
	 *
	 *             public void setUser(Client user) { this.user = user; }
	 */

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
