import userdata.Customer;
import userdata.Order;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Calls from index.jsp page
 * store customer information and redirect to order page
 * */

public class ServletCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        try {
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            int pNumber = Integer.parseInt(request.getParameter("pNumber"));
            String email = request.getParameter("email");
            String status = request.getParameter("orderType");

            Customer customer = new Customer();
            customer.setName(name);
            customer.setAddress(address);
            customer.setOrderType(status);
            customer.setPhoneNumber(pNumber);
            customer.setEmail(email);
            Order.setCustomer(customer);

            response.sendRedirect("order.jsp");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            out.append("<a href='index.jsp'><h1>There is trouble processing your information. Make sure its correct and try again.</h1></a>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
