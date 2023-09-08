/**
 * 
 */
package fr.idformation.marioPizza.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author lenovo
 *
 */
@Entity
@Table(name = "users")
public class Client {

	/**
	 * id of the client.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * client's phonenumber.
	 */
	@Column(name = "phonenumber")
	private String phonenumber;

	/**
	 * client's firstname.
	 */
	@Column(name = "firstname")
	private String firstname;

	/**
	 * client's lastname.
	 */
	@Column(name = "lastname")
	private String lastname;

	/**
	 * the client password chiffré.
	 */
	@Column(name = "password")
	private String password;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pPassword the password to set
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * client address.
	 */
	@Column(name = "address")
	private String address;

	/**
	 * list of all his commande.
	 *
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE) private
	 *                     List<Order> orders;
	 */
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Client's class constructor .
	 */
	public Client() {
		super();
	}

	/**
	 * Client's class 's constructor.
	 *
	 * @param pId
	 * @param pPhonenumber
	 * @param pFirstname
	 * @param pLastname
	 * @param pAddress
	 */
	public Client(final Long pId, final String pPhonenumber, final String pFirstname, final String pLastname,
			final String pAddress) {
		super();
		this.id = pId;
		this.phonenumber = pPhonenumber;
		this.firstname = pFirstname;
		this.lastname = pLastname;
		this.address = pAddress;
	}

	/**
	 * @param phonenumber
	 * @param firstname
	 * @param lastname
	 * @param password
	 * @param address
	 */
	public Client(String phonenumber, String firstname, String lastname, String password, String address) {
		super();
		this.phonenumber = phonenumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.address = address;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the orders
	 *
	 *         public List<Order> getOrders() { return orders; }
	 */

	/**
	 * @param pOrders the orders to set
	 *
	 *                public void setOrders(final List<Order> pOrders) { this.orders
	 *                = pOrders; }
	 */

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pPhonenumber the phonenumber to set
	 */
	public void setPhonenumber(final String pPhonenumber) {
		this.phonenumber = pPhonenumber;
	}

	/**
	 * @param pFirstname the firstname to set
	 */
	public void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	/**
	 * @param pLastname the lastname to set
	 */
	public void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}

	/**
	 * @param pAddress the address to set
	 */
	public void setAddress(final String pAddress) {
		this.address = pAddress;
	}

}
