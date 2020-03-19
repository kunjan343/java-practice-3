package com.sheridansports.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DisplayCardInfo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter card type:");
        String cardType = input.nextLine();

        // Import JDBC driver
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Database connection credentials
        String connURL = "jdbc:mysql://localhost/sheridansports";
        String uname = "root";
        String pass = "root";

        // Connect database
        Connection conn = DriverManager.getConnection(connURL, uname, pass);

        String query = "SELECT * from card C inner join user U on C.UserId = U.UserId where CardType = ? order by C.CardNumber";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, cardType);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String result = rs.getString("CardType") +
                    "\t" + rs.getString("CardNumber") +
                    "\t" + rs.getString("ExpiryMonth") +
                    "/" + rs.getString("ExpiryYear") +
                    "\t" + rs.getString("FirstName") +
                    "\t" + rs.getString("Username");
            System.out.println(result);
        }

        rs.close();
        ps.close();
    }
}
