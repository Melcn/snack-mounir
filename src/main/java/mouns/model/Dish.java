package mouns.model;

public class Dish {

	private int idDish;
	private String captionDish;
	private double priceDish;

	public Dish(int idDish, String captionDish, double priceDish) {
		super();
		this.idDish = idDish;
		this.captionDish = captionDish;
		this.priceDish = priceDish;
	}

	public int getIdDish() {
		return idDish;
	}

	public void setIdDish(int idDish) {
		this.idDish = idDish;
	}

	public String getCaptionDish() {
		return captionDish;
	}

	public void setCaptionDish(String captionDish) {
		this.captionDish = captionDish;
	}

	public double getPriceDish() {
		return priceDish;
	}

	public void setPriceDish(double priceDish) {
		this.priceDish = priceDish;
	}

	@Override
	public String toString() {
		return "Dish [idDish=" + idDish + ", captionDish=" + captionDish + ", priceDish=" + priceDish + "]";
	}

}
