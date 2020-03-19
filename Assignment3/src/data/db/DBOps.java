package data.db;

import data.model.Student;

import java.sql.*;

public class DBOps {
    private static Connection connection;

    /*public static void main(String[] args) {

    }*/

    private static void connect() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return;
        }
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Database connection credentials
        String connURL = "jdbc:mysql://localhost/grades";
        String uname = "root";
        String pass = "root";

        // Connect database
        connection = DriverManager.getConnection(connURL, uname, pass);
    }

    public static int insertRow(Student student) throws SQLException, ClassNotFoundException {
        connect();

        String query = "INSERT INTO prog32758 (StudentID, LastName, FirstName, Q1, Q2, Q3, Q4, A1, A2, A3, MidtermExam, FinalExam) values(?,?,?,?,?,?,?,?,?,?,?,?);";

        PreparedStatement stmt = connection.prepareStatement(query);

        stmt.setInt(1, student.getStudentNo());
        stmt.setString(2, student.getFirstName());
        stmt.setString(3, student.getLastName());
        stmt.setInt(4, student.getQ1());
        stmt.setInt(5, student.getQ2());
        stmt.setInt(6, student.getQ3());
        stmt.setInt(7, student.getQ4());
        stmt.setInt(8, student.getA1());
        stmt.setInt(9, student.getA2());
        stmt.setInt(10, student.getA3());
        stmt.setInt(11, student.getMidtermExam());
        stmt.setInt(12, student.getFinalExam());

        return stmt.executeUpdate();
    }

    public static int modifyRow(Student student) throws SQLException, ClassNotFoundException {
        connect();

        String query = "UPDATE prog32758 SET " +
                "FirstName=?, LastName=?," +
                "Q1=?, Q2=?, Q3=?, Q4=?," +
                "A1=?, A2=?, A3=?," +
                "MidtermExam=?, FinalExam=? " +
                "WHERE StudentID=?;";

        PreparedStatement stmt = connection.prepareStatement(query);

        stmt.setString(1, student.getFirstName());
        stmt.setString(2, student.getLastName());
        stmt.setInt(3, student.getQ1());
        stmt.setInt(4, student.getQ2());
        stmt.setInt(5, student.getQ3());
        stmt.setInt(6, student.getQ4());
        stmt.setInt(7, student.getA1());
        stmt.setInt(8, student.getA2());
        stmt.setInt(9, student.getA3());
        stmt.setInt(10, student.getMidtermExam());
        stmt.setInt(11, student.getFinalExam());
        stmt.setInt(12, student.getStudentNo());

        return stmt.executeUpdate();
    }

    public static ResultSet getRow(int studentNo) throws SQLException, ClassNotFoundException {
        connect();

        String query = "SELECT * FROM prog32758 where StudentID=?;";

        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, studentNo);

        return stmt.executeQuery();
    }
}
