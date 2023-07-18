package mouns.model;

public class Drink {

	private int idDrink;
	private String captionDrink;
	private double priceDrink;

	public Drink(int idDrink, String captionDrink, double priceDrink) {
		super();
		this.idDrink = idDrink;
		this.captionDrink = captionDrink;
		this.priceDrink = priceDrink;
	}

	public int getIdDrink() {
		return idDrink;
	}

	public void setIdDrink(int idDrink) {
		this.idDrink = idDrink;
	}

	public String getCaptionDrink() {
		return captionDrink;
	}

	public void setCaptionDrink(String captionDrink) {
		this.captionDrink = captionDrink;
	}

	public double getPriceDrink() {
		return priceDrink;
	}

	public void setPriceDrink(double priceDrink) {
		this.priceDrink = priceDrink;
	}

	@Override
	public String toString() {
		return "Drink [idDrink=" + idDrink + ", captionDrink=" + captionDrink + ", priceDrink=" + priceDrink + "]";
	}

}
