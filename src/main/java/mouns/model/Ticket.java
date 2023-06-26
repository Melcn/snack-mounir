package mouns.model;

public class Ticket {

	private Integer id;
	private Article name;
	private Integer price;
	private Integer quantity;
	private Integer total;
	private Integer tva;
	
	
	public Ticket() {
		super();
	}
	public Ticket(Integer id, Article name, Integer price, Integer quantity, Integer total, Integer tva) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.tva = tva;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Article getName() {
		return name;
	}
	public void setName(Article name) {
		this.name = name;
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
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getTva() {
		return tva;
	}
	public void setTva(Integer tva) {
		this.tva = tva;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", total="
				+ total + ", tva=" + tva + "]";
	}
	
	
	
}
