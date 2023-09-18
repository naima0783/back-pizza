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
	 * the orderline's la pause .
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
	 * @param pId          the order's Id
	 * @param pName        the order's name
	 * @param pDescription pizza's description
	 * @param pImage       pizza's image
	 * @param pPrice       pizza's price
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
	 * getter of order'id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * getter of the name.
	 *
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
	 * setter of pizza's description.
	 *
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
