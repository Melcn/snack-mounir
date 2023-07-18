package mouns.model;

import java.util.List;

public interface IArticleDAO {

	public void addDish(Dish myDish);
	public void deleteDish(int id);
	public void updateDish(Dish myDish);
	public Dish getDish(int id);
	public List<Dish> getAllDish();
}
