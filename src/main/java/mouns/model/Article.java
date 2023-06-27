package mouns.model;

public class Article {

	private String description;
	private Double price;
	private Integer quantity;
	private Double totalPriceQuantity;

	public Article() {
		super();
	}

	public Article(String description, Double price, Integer quantity, Double totalPriceQuantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.totalPriceQuantity = totalPriceQuantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPriceQuantity() {
		return totalPriceQuantity;
	}

	public void setTotalPriceQuantity(Double totalPriceQuantity) {
		this.totalPriceQuantity = totalPriceQuantity;
	}

	@Override
	public String toString() {
		return "Article [description=" + description + ", price=" + price + ", quantity=" + quantity
				+ "totalPriceQuantity=" + totalPriceQuantity + "]";
	}

}
