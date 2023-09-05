package fr.idformation.marioPizza.security.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.lang.NonNull;

import fr.idformation.marioPizza.Application;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "phonenumber") })
public class User {

	/**
	 * Id of the user.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * user's phone number.
	 */
	@NonNull
	@Size(max = Application.COLUMN20)
	private String phonenumber;

	/**
	 * user's password.
	 */
	@NonNull
	@Size(max = 120)
	private String password;

	/**
	 * user's first name.
	 */
	@NonNull
	@Size(max = 120)
	private String firstname;

	/**
	 * user's last name.
	 */
	@NonNull
	@Size(max = 120)
	private String lastname;

	/**
	 * user's address.
	 */
	@NonNull
	@Size(max = 120)
	private String address;

	/**
	 * the user's roles.
	 */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	/**
	 * Initializer of the user.
	 */
	public User() {
	}

	/**
	 * Initializer of the user.
	 *
	 * @param pPhonenumber
	 * @param pPassword
	 */
	public User(final String pPhonenumber, final String pPassword) {
		this.phonenumber = pPhonenumber;
		this.password = pPassword;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Getter of the Id.
	 *
	 * @return the id
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
	 * Getter of password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of role.
	 *
	 * @return all the roles.
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param pFirstname the firstname to set.
	 */
	public void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	/**
	 * setter of Id .
	 *
	 * @param pId
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pLastname the lastname to set.
	 */
	public void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}

	/**
	 * Setter of password.
	 *
	 * @param pPassword
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * Setter of Roles.
	 *
	 * @param pRoles
	 */
	public void setRoles(final Set<Role> pRoles) {
		this.roles = pRoles;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param pPhonenumber the phonenumber to set
	 */
	public void setPhonenumber(final String pPhonenumber) {
		this.phonenumber = pPhonenumber;
	}

	/**
	 * @param pAddress the address to set
	 */
	public void setAddress(final String pAddress) {
		this.address = pAddress;
	}

}
