package fr.idformation.mariopizza.security.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.lang.NonNull;

import fr.idformation.mariopizza.MariopizzaApplication;
import fr.idformation.mariopizza.core.domain.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "phonenumber") })
public class User {
	/**
	 * the user's id .
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * the user's phonenumber .
	 */
	@NonNull
	@Size(max = 20)
	private String phonenumber;

	/**
	 * the user's address.
	 */
	@NonNull
	@Size(max = MariopizzaApplication.SIZE_MAX)
	private String address;

	/**
	 * the user's password .
	 */
	@NonNull
	@Size(max = MariopizzaApplication.SIZE_MAX)
	private String password;

	/**
	 * the user's firstname .
	 */
	@NonNull
	@Size(max = 100)
	private String firstname;

	/**
	 * the user's lastname.
	 */
	@NonNull
	@Size(max = 100)
	private String lastname;

	/**
	 * the user's order.
	 */
	@OneToMany(mappedBy = "user")
	private List<Order> orders;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param pAddress the address to set
	 */
	public void setAddress(final String pAddress) {
		this.address = pAddress;
	}

	/**
	 * the user's role .
	 */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	/**
	 * the user's Connstructor .
	 */
	public User() {
	}

	/**
	 * the User's constructor.
	 *
	 * @param username  te user's username
	 * @param pPassword the user's password
	 */
	public User(final String username, final String pPassword) {
		this.phonenumber = username;
		this.password = pPassword;
	}

	/**
	 * the getter of user's phonenumber .
	 *
	 * @return the user's phonenumber
	 */
	public String getEmail() {
		return phonenumber;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Geter of user's Id.
	 *
	 * @return the user's id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Getter of user's password .
	 *
	 * @return the user's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Getter of user's roles .
	 *
	 * @return the user's role
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * Getter of user's Phonenumber.
	 *
	 * @return the user's phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param pFirstname the firstname to set
	 */
	public void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	/**
	 * the setter of user's id .
	 *
	 * @param pId the user's id .
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pLastname the lastname to set
	 */
	public void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}

	/**
	 * Setter of user's password .
	 *
	 * @param pPassword
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * Setter of user's role.
	 *
	 * @param pRoles the user's role .
	 */
	public void setRoles(final Set<Role> pRoles) {
		this.roles = pRoles;
	}

	/**
	 * setter of user's phonenumber.
	 *
	 * @param pUsername
	 */
	public void setPhonenumber(final String pUsername) {
		this.phonenumber = pUsername;
	}
}
