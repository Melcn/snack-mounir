package mouns.model;

import java.util.List;

public interface IDrinkDAO {

	public void addDrink(Drink myDrink);

	public void deleteDrink(int id);

	public void updateDrink(Drink myDrink);

	public Drink getDrink(int id);

	public List<Drink> getAllDrink();
}
