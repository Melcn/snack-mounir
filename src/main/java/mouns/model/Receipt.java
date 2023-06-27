package mouns.model;

import java.util.Date;

public class Receipt {

	private Article description;
	private Integer totalHT;
	private Integer totalTTC;
	private Integer tva;
	private Date date;

	public Receipt() {
		super();
	}

	public Receipt(Article description, Integer totalHT, Integer totalTTC, Integer tva, Date date) {
		super();

		this.description = description;
		this.totalHT = totalHT;
		this.totalTTC = totalTTC;
		this.tva = tva;
		this.date = date;
	}


	public Article getDescription() {
		return description;
	}

	public void setDescription(Article description) {
		this.description = description;
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
		return "Ticket [description=" + description + ", totalHT=" + totalHT + ", totalTTC=" + totalTTC + ", tva="
				+ tva + ", date=" + date + "]";
	}

	
}
