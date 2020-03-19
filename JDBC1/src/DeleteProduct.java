import com.sheridansports.jdbc.DBOps;

import java.sql.*;
import java.util.Scanner;

public class DeleteProduct {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter productID :");
        String id = input.nextLine();

        DBOps.connect();

        String query = "DELETE from product where productid = '" + id + "'";

        int result = DBOps.executeUpdate(query);
        System.out.println(result);

        if (result > 0) {
            System.out.println("Product is deleted from system.");
        } else {
            System.out.println("Something went wrong, please try again.");
        }

    }
}
