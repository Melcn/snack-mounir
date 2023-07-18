package mouns.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImp implements IArticleDAO {

	static Connection conn = null;
	/* Connect static Database */

	public void addDish(Dish myDish) {

		PreparedStatement stmtAddDish;
		try {

			stmtAddDish = conn.prepareStatement("INSERT INTO dishes (caption, price) VALUES (?,?)");
			stmtAddDish.setString(1, myDish.getCaptionDish());
			stmtAddDish.setDouble(2, myDish.getPriceDish());
			int nbInserted = stmtAddDish.executeUpdate();
			System.out.println(nbInserted);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteDish(int id) {

	}

	public void updateDish(Dish myDish) {

	}

	public void getDish(int id) {

	}

	public List<Dish> getAllDish() {
		List<Dish> myDishes = new ArrayList<Dish>();
		return myDishes;
	}
}
