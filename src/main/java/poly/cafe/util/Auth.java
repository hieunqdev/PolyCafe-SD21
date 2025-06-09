package poly.cafe.util;

import java.sql.*;
import poly.cafe.util.XJdbc;

public class Auth {
    public static boolean DangNhap(String tenDangNhap, String matKhau) {
        String sql = "SELECT * \n"
                + "FROM Users \n"
                + "WHERE Username = ? \n"
                + "AND Password = ?;";
        
        try (Connection con = XJdbc.openConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, tenDangNhap);  
            ps.setString(2, matKhau);  
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                GlobalState.Manager = rs.getBoolean("Manager");
                GlobalState.Fullname = rs.getString("Fullname");
                return true;
            }
            return false;
            
        } catch (Exception e) {
            return false;
        }
    }
}
