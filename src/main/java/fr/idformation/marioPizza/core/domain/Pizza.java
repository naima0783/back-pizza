package fr.idformation.marioPizza.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza {

	/**
	 * id of the pizza.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * pizza's name.
	 */
	@Column(name = "name")
	private String name;

	/**
	 * pizza's description.
	 */
	@Column(name = "description")
	private String description;

	/**
	 * pizza's image.
	 */
	@Column(name = "image")
	private String image;

	/**
	 * pizza's price.
	 */
	@Column(name = "price")
	private Double price;

	/**
	 * Initializer of the pizza .
	 */
	public Pizza() {
		super();
	}

	/**
	 * Initializer of the pizza.
	 *
	 * @param pId
	 * @param pName
	 * @param pDescription
	 * @param pImage
	 * @param pPrice
	 */
	public Pizza(final Long pId, final String pName, final String pDescription, final String pImage,
			final Double pPrice) {
		super();
		this.id = pId;
		this.name = pName;
		this.description = pDescription;
		this.image = pImage;
		this.price = pPrice;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pName the name to set
	 */
	public void setName(final String pName) {
		this.name = pName;
	}

	/**
	 * @param pDescription the description to set
	 */
	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	/**
	 * @param pImage the image to set
	 */
	public void setImage(final String pImage) {
		this.image = pImage;
	}

	/**
	 * @param pPrice the price to set
	 */
	public void setPrice(final Double pPrice) {
		this.price = pPrice;
	}

}
