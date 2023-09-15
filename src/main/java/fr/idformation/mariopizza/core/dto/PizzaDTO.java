package fr.idformation.mariopizza.core.dto;

import fr.idformation.mariopizza.core.domain.Pizza;

public class PizzaDTO {

	/**
	 * id of the pizza.
	 */
	private Long id;

	/**
	 * pizza's name.
	 */
	private String name;

	/**
	 * pizza's description.
	 */
	private String description;

	/**
	 * pizza's image.
	 */
	private String image;

	/**
	 * pizza's price.
	 */
	private Double price;

	/**
	 * Initializer of the DTO's pizza .
	 *
	 * @param pizza
	 */
	public PizzaDTO(final Pizza pizza) {
		this.id = pizza.getId();
		this.description = pizza.getDescription();
		this.image = pizza.getImage();
		this.name = pizza.getName();
		this.price = pizza.getPrice();
	}

	/**
	 * initilizer of the dto's pizza.
	 */
	public PizzaDTO() {
		super();
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
