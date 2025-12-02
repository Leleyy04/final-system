package studentdetailsmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection con = null;

    public static Connection getConnection() {
        if (con != null) return con;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Make sure database, user, and password match your MySQL setup
            String url = "jdbc:mysql://localhost:3306/StudentnDB?useSSL=false&serverTimezone=UTC";
            String user = "root";          // Your MySQL username
            String password = "100405";    // Your MySQL password

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }

        return con;
    }
}
