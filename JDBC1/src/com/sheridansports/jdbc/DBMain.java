package com.sheridansports.jdbc;

import java.sql.*;

class DBMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Database connection credentials
        String connURL = "jdbc:mysql://localhost/sheridansports";
        String uname = "root";
        String pass = "root";

        // Connect database
        Connection conn = DriverManager.getConnection(connURL, uname, pass);

        // Write query to execute
        // String query = "SELECT * from user where username = 'audreyc' and password = 'shoes'";
        // Send request
        // Statement stmt = conn.createStatement();
        // Receive result in result set
        // ResultSet rs = stmt.executeQuery(query);


        String query = "SELECT * from user where username = ? and password = ?";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, "audreyc");
        ps.setString(2, "shoes");

        ResultSet rs = ps.executeQuery();

        // Initially cursor point before first record
        rs.next();

        System.out.println(rs.getString("firstname") + " " + rs.getString("lastname"));

        rs.close();
        ps.close();
        // stmt.close();
        // conn.close();

    }
}
