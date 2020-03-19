import userdata.Pizza;
import userdata.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Calls from order.jsp page
 * store pizza information and redirect back to order.jsp
 * if customer ask for checkout, it redirects to checkout page
 * */

@WebServlet(name = "ServletOrderBuilder")
public class ServletOrderBuilder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String action = request.getParameter("actionButton");

            ArrayList<Pizza> pizzas = Order.getPizzas();

            if (action.equals("Add Pizza")) {
                String size = request.getParameter("size");
                String[] toppings = request.getParameterValues("topping");
                if (toppings.length < 2) {
                    response.sendRedirect("order.jsp");
                    return;
                }

                Pizza pizza = new Pizza();
                pizza.setSize(size);
                pizza.setToppings(toppings);
                pizzas.add(pizza);


                double tax = 0;
                double total = 0;
                for (Pizza pizza1 : pizzas) {
                    tax += pizza1.getPrice() * 0.13;
                    total += pizza1.getPrice();
                }
                total += tax;

                Order.setPizzas(pizzas);
                Order.setTax(tax);
                Order.setTotal(total);

                response.sendRedirect("order.jsp");
            } else {
                response.sendRedirect("checkout.jsp");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        doPost(request, response);
    }
}
