package ca.sheridan.servlets;

import ca.sheridan.database.DBOps;

import java.time.LocalDateTime;

public class Logger {
    public static void write(String message) {
        try {
            LocalDateTime d = LocalDateTime.now();
            String query = "insert into log (dateNow, description) values ('" + d + "','" + message + "')";

            DBOps.connect();
            DBOps.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println("Exception : ");
            ex.printStackTrace();
        }
    }
}
