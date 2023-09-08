package fr.idformation.marioPizza.core.dto;

import java.util.List;

import fr.idformation.marioPizza.core.domain.Client;

public class ClientDTO {
	/**
	 * the client id 's Dto .
	 */
	private Long id;

	/**
	 * clientDto's phonenumber.
	 */
	private String phonenumber;

	/**
	 * clientDto's firstname.
	 */
	private String firstname;

	/**
	 * clientDto's lastname.
	 */
	private String lastname;

	/**
	 * the client's password .
	 */
	private String password;

	/**
	 * clientDto's address.
	 */
	private String address;

	private List<OrderDTO> orders;

	/**
	 * @return the orders
	 */
	public List<OrderDTO> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}

	/**
	 * The clientDto's constructor.
	 *
	 * @param client the client
	 */
	public ClientDTO(final Client client) {
		super();
		this.id = client.getId();
		this.phonenumber = client.getPhonenumber();
		this.firstname = client.getFirstname();
		this.lastname = client.getLastname();
		this.address = client.getAddress();
	}

	/**
	 * @param phonenumber
	 * @param firstname
	 * @param lastname
	 * @param password
	 * @param address
	 */
	public ClientDTO(String phonenumber, String firstname, String lastname, String password, String address) {
		super();
		this.phonenumber = phonenumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.address = address;
	}

	/**
	 * The clientDto 's constructor .
	 */
	public ClientDTO() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
