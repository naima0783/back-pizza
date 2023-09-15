package fr.idformation.mariopizza.core.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	 * 
	 */
	@OneToMany(mappedBy = "pizza")
	private List<OrderLine> orderLines;

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
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

}
