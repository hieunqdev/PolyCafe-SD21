package poly.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.cafe.entity.Category;
import poly.cafe.util.XJdbc;

public class CategoryDAO {
    public static List<Category> findAll() {
        String sql = "SELECT * FROM Categories;";
        
        List<Category> categoryLst = new ArrayList<Category>();
        
        try (Connection con = XJdbc.openConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String id = rs.getString("Id");
                String name = rs.getString("Name");
                
                Category category = new Category(id, name);
                categoryLst.add(category);
            }
            return categoryLst;
            
        } catch (Exception e) {
            return categoryLst;
        }
    }
}
