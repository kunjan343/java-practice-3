package com.app.dao;

import java.sql.*;

public class DAO {
    private static Connection connection;

    private static void connect() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return;
        }
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Database connection credentials
        String connURL = "jdbc:mysql://localhost/sheridanusedcars";
        String uname = "root";
        String pass = "root";

        // Connect database
        connection = DriverManager.getConnection(connURL, uname, pass);
    }

    public static ResultSet getRow(String carId, double maxPrice) throws SQLException, ClassNotFoundException {
        connect();

        String query = "SELECT * FROM car where manufacturerID=? AND price<=?;";

        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, carId);
        stmt.setDouble(2, maxPrice);

        return stmt.executeQuery();
    }

}
