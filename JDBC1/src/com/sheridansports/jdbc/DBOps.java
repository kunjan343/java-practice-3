package com.sheridansports.jdbc;

import java.sql.*;
import java.util.Calendar;

public class DBOps {
    private static Connection connection;

    public static void main(String[] args) {
        Calendar.getInstance();
        new Time(Calendar.getInstance().getTimeInMillis());
    }

    public static void connect() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Database connection credentials
        String connURL = "jdbc:mysql://localhost/sheridansports";
        String uname = "root";
        String pass = "root";

        // Connect database
        connection = DriverManager.getConnection(connURL, uname, pass);
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }

    public static int executeUpdate(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeUpdate(query);
    }

    public static void close() throws SQLException {
        connection.close();
    }
}
