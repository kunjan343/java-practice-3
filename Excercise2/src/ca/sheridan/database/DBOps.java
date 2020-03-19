package ca.sheridan.database;

import java.sql.*;

public class DBOps {
    private static Connection connection;

    public static void connect() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Database connection credentials
        String connURL = "jdbc:mysql://localhost/log";
        String uname = "root";
        String pass = "root";

        // Connect database
        connection = DriverManager.getConnection(connURL, uname, pass);
    }

    public static void executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeQuery(query);
    }

    public static void executeUpdate(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    }

    public static void close() throws SQLException {
        connection.close();
    }
}
