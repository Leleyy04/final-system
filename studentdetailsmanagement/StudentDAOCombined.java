package studentdetailsmanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOCombined {
    private Connection conn;

    public StudentDAOCombined() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentnDB", "root", "100405"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student s) throws SQLException {
        String sql = "INSERT INTO students (id, name, age, course, year) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setInt(3, s.getAge());
        ps.setString(4, s.getCourse());
        ps.setInt(5, s.getYear());
        ps.executeUpdate();
    }

    public void updateStudent(Student s) throws SQLException {
        String sql = "UPDATE students SET name=?, age=?, course=?, year=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setInt(2, s.getAge());
        ps.setString(3, s.getCourse());
        ps.setInt(4, s.getYear());
        ps.setInt(5, s.getId());
        ps.executeUpdate();
    }

    public void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public ResultSet getAllStudents() throws SQLException {
    Connection conn = DBConnection.getConnection();
    String sql = "SELECT * FROM Students";
    PreparedStatement pst = conn.prepareStatement(sql);
    return pst.executeQuery();
}

}
