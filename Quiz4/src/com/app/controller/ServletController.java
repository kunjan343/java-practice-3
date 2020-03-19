package com.app.controller;

import com.app.beans.Car;
import com.app.dao.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "ServletController")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String manufacturerId = request.getParameter("manufacturerId");
        double maxPrice = Double.parseDouble(request.getParameter("maxPrice"));

        ArrayList<Car> cars = new ArrayList<>();

        try {
            ResultSet rs = DAO.getRow(manufacturerId, maxPrice);

            while (rs.next()) {
                Car car = new Car();
                car.setCarId(rs.getInt("carID"));
                car.setManufacturerId(rs.getInt("manufacturerID"));
                car.setModel(rs.getString("model"));
                car.setYear(rs.getInt("year"));
                car.setColour(rs.getString("colour"));
                car.setPrice(rs.getDouble("price"));

                cars.add(car);
            }

            System.out.println(cars.size());
            request.setAttribute("cars", cars);
            request.getRequestDispatcher("view.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
