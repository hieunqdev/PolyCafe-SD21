package poly.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.cafe.dto.CategoryDrinkDTO;
import poly.cafe.entity.Category;
import poly.cafe.entity.Drink;
import poly.cafe.util.XJdbc;

public class DrinkDAO {
    public static List<Drink> findAll(String CategoryId) {
        String sql = "SELECT * FROM Drinks WHERE CategoryId = ?;";
        List<Drink> drinkLst = new ArrayList<>();
        
        try (Connection con = XJdbc.openConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
                
            ps.setString(1, CategoryId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String id = rs.getString("Id");
                String name = rs.getString("Name");
                String image = rs.getString("Image");
                Double unitPrice = rs.getDouble("UnitPrice");
                Double discount = rs.getDouble("Discount");
                Boolean available = rs.getBoolean("Available");
                String categoryId = rs.getString("CategoryId");
                
                Drink drink = new Drink(id, name, image, 0, 0, true, categoryId);
                drinkLst.add(drink);
            }
            return drinkLst;
            
        } catch (Exception e) {
            return drinkLst;
        }
    }
    
}
