import dataClass.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletController")
public class ServletController extends HttpServlet {
    private ArrayList<Phone> phoneList;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ArrayList<Phone> phones = (ArrayList<Phone>) request.getSession().getAttribute("phoneList");
            phoneList = phones == null ? new ArrayList<>() : phones;

            String name = request.getParameter("cellphone");
            double price = Double.parseDouble(request.getParameter(name + "Price"));

            Phone phone = new Phone(name, price);
            phoneList.add(phone);

            System.out.println("pass");

            request.getSession().setAttribute("phoneList", phoneList);
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
