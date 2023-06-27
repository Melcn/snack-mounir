package mouns.model;


import java.util.Date;
import java.util.List;

public class Receipt {

	private List<Article> articles;
	private Double totalHT;
	private Double totalTTC;
	private Integer tva;
	private Date date;

	public Receipt() {
		super();
	}

	public Receipt(List<Article> articles, Double totalHT, Double totalTTC, Integer tva, Date date) {
		super();

		this.articles = articles;
		this.totalHT = totalHT;
		this.totalTTC = totalTTC;
		this.tva = tva;
		this.date = date;
	}


	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Double getTotalHT() {
		return totalHT;
	}

	public void setTotalHT(Double totalHT) {
		this.totalHT = totalHT;
	}

	public Double getTotalTTC() {
		return totalTTC;
	}

	public void setTotalTTC(Double totalTTC) {
		this.totalTTC = totalTTC;
	}

	public Integer getTva() {
		return tva;
	}

	public void setTva(Integer tva) {
		this.tva = tva;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Ticket [description=" + articles + ", totalHT=" + totalHT + ", totalTTC=" + totalTTC + ", tva="
				+ tva + ", date=" + date + "]";
	}

	
	
}
