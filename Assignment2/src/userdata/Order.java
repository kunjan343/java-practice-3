package userdata;

import java.util.ArrayList;

public class Order {
    private static ArrayList<Pizza> pizzas = new ArrayList<>();
    private static Customer customer;
    private static double tax = 0;
    private static double total = 0;

    public static void setPizzas(ArrayList<Pizza> pizzas) {
        Order.pizzas = pizzas;
    }

    public static ArrayList<Pizza> getPizzas() {
        return Order.pizzas;
    }

    public static Customer getCustomer() {
        return Order.customer;
    }

    public static void setCustomer(Customer customer) {
        Order.customer = customer;
    }

    public static double getTax() {
        return Order.tax;
    }

    public static void setTax(double tax) {
        Order.tax = tax;
    }

    public static double getTotal() {
        return Order.total;
    }

    public static void setTotal(double total) {
        Order.total = total;
    }
}
