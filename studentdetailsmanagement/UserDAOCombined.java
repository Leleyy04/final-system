package studentdetailsmanagement;

import java.sql.*;

public class UserDAOCombined {



    private Connection con;

public UserDAOCombined() {
    con = DBConnection.getConnection();
}

// Add a login method
public boolean login(String username, String password) {
    try {
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();
        return rs.next(); // true if a user is found
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}



}
