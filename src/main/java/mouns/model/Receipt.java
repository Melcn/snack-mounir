package mouns.model;

import java.util.Date;

public class Receipt {

	private Integer id;
	private Article name;
	private Integer totalHT;
	private Integer totalTTC;
	private Integer tva;
	private Date date;

	public Receipt() {
		super();
	}

	public Receipt(Integer id, Article name, Integer totalHT, Integer totalTTC, Integer tva, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.totalHT = totalHT;
		this.totalTTC = totalTTC;
		this.tva = tva;
		this.date = date;
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

	public Integer getTotalHT() {
		return totalHT;
	}

	public void setTotalHT(Integer totalHT) {
		this.totalHT = totalHT;
	}

	public Integer getTotalTTC() {
		return totalTTC;
	}

	public void setTotalTTC(Integer totalTTC) {
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
		return "Ticket [id=" + id + ", name=" + name + ", totalHT=" + totalHT + ", totalTTC=" + totalTTC + ", tva="
				+ tva + ", date=" + date + "]";
	}

	
}
