package mouns.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImp implements IArticleDAO {

	static Connection conn = null;
	/* Connect static Database */

	public void addDish(Dish myDish) {

		PreparedStatement stmtAddDish;
		try {

			stmtAddDish = conn.prepareStatement("INSERT INTO articles (caption, price) VALUES (?,?)");
			stmtAddDish.setString(1, myDish.getCaptionDish());
			stmtAddDish.setDouble(2, myDish.getPriceDish());
			int nbInserted = stmtAddDish.executeUpdate();
			System.out.println(nbInserted);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteDish(int id) {
		PreparedStatement stmtDeleteDish;
		try {
			stmtDeleteDish = conn.prepareStatement("DELETE FROM articles WHERE id = ?");
			stmtDeleteDish.setInt(1, id);
			int nbInserted = stmtDeleteDish.executeUpdate();
			System.out.println(nbInserted);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateDish(Dish myDish) {

		PreparedStatement stmtUpDish;
		try {
			stmtUpDish = conn.prepareStatement("UPDATE articles SET libelle = ?, prix = ? WHERE id = ? ");
			stmtUpDish.setString(1, myDish.getCaptionDish());
			stmtUpDish.setDouble(2, myDish.getPriceDish());
			stmtUpDish.setInt(3, myDish.getIdDish());
			int nbInserted = stmtUpDish.executeUpdate();
			System.out.println(nbInserted);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Dish getDish(int id) {

		PreparedStatement stmtDish;
		Dish newDish = null;
		try {
			stmtDish = conn.prepareStatement("SELECT * FROM articles WHERE id= ?");
			stmtDish.setInt(1, id);
			ResultSet res = stmtDish.executeQuery();
			if(res.next()) {
				newDish = new Dish(res.getInt("id"), res.getString("caption"), res.getDouble("price"));
			}
       
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return newDish;
	}

	public List<Dish> getAllDish() {
		List<Dish> myDishes = new ArrayList<Dish>();
		PreparedStatement stmtDish;
		try {
			stmtDish = conn.prepareStatement("SELECT * FROM articles");
			
			ResultSet res = stmtDish.executeQuery();	
			while(res.next()) {
				myDishes.add(new Dish(res.getInt("id"),res.getString("caption") ,res.getInt("price") ));				
        	   	}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myDishes;
	}
}
