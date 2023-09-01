package fr.idformation.marioPizza.security.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	/**
	 * role's id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * role's name.
	 */
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private RoleName name;

	/**
	 * Initializer of the role.
	 */
	public Role() {
	}

	/**
	 * Initializer of the role.
	 *
	 * @param pName
	 */
	public Role(final RoleName pName) {
		this.name = pName;
	}

	/**
	 * id's getter .
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * name's getter.
	 *
	 * @return the name
	 */
	public RoleName getName() {
		return name;
	}

	/**
	 * id's setter.
	 *
	 * @param pId
	 */
	public void setId(final Integer pId) {
		this.id = pId;
	}

	/**
	 * name's setter.
	 *
	 * @param pName
	 */
	public void setName(final RoleName pName) {
		this.name = pName;
	}
}
