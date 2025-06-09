package poly.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.cafe.entity.Card;
import poly.cafe.util.XJdbc;

public class CardDAO {    
    public static List<Card> findAll() {
        String sql = "SELECT * FROM Cards;";
        List<Card> cardLst = new ArrayList<Card>();
        
        try (Connection con = XJdbc.openConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer id = rs.getInt("Id");
                int status = rs.getInt("Status");
                
                Card card = new Card(id, status);
                cardLst.add(card);
            }
            return cardLst;
        } catch (Exception e) {
            return cardLst;
        }
    }
}
