package mouns.model;

public class Article {

	private Integer id_article;
	private String article_name;
	private String description;
	private Integer price;
	private Integer quantity;
	private Integer totalPriceQuantity;

	public Article() {
		super();
	}

	public Article(Integer id_article, String article_name, String description, Integer price, Integer quantity,
			Integer totalPriceQuantity) {
		super();
		this.id_article = id_article;
		this.article_name = article_name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.totalPriceQuantity = totalPriceQuantity;
	}

	public Integer getId_article() {
		return id_article;
	}

	public void setId_article(Integer id_article) {
		this.id_article = id_article;
	}

	public String getArticle_name() {
		return article_name;
	}

	public void setArticle_name(String article_name) {
		this.article_name = article_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTotalPriceQuantity() {
		return totalPriceQuantity;
	}

	public void setTotalPriceQuantity(Integer totalPriceQuantity) {
		this.totalPriceQuantity = totalPriceQuantity;
	}

	@Override
	public String toString() {
		return "Article [id_article=" + id_article + ", article_name=" + article_name + ", description=" + description
				+ ", price=" + price + ", quantity=" + quantity + "totalPriceQuantity=" + totalPriceQuantity + "]";
	}

}
