package controllers;

import data.db.DBModel;
import data.model.Student;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "ServletIntro")
public class ServletIntro extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        /*======== Find Student Record ==============*/
        int studentNo = Integer.parseInt(request.getParameter("studentNo"));

        try {
            ResultSet data = DBModel.findStudent(studentNo);
            Student student = new Student();

            if (data.next() && data.getInt("StudentID") == studentNo) {
                student.setStudentNo(data.getInt("StudentID"));
                student.setFirstName(data.getString("FirstName"));
                student.setLastName(data.getString("LastName"));
                student.setQ1(data.getInt("Q1"));
                student.setQ2(data.getInt("Q2"));
                student.setQ3(data.getInt("Q3"));
                student.setQ4(data.getInt("Q4"));
                student.setA1(data.getInt("A1"));
                student.setA2(data.getInt("A2"));
                student.setA3(data.getInt("A3"));
                student.setMidtermExam(data.getInt("MidtermExam"));
                student.setFinalExam(data.getInt("FinalExam"));
                StudentService.setStudent(student);
            } else {
                StudentService.studentExist = false;
            }

            request.setAttribute("studentExist", StudentService.studentExist);
            request.setAttribute("student", student);
            request.getRequestDispatcher("intro/intro.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException | IOException | ServletException e) {
            e.printStackTrace();
        }

        /*======= Insert Student Record ==========*/
        /*Student student = new Student();
        student.setStudentNo(3564785);
        student.setFirstName("Kunjan");
        student.setLastName("Patel");
        student.setQ1(86);
        student.setQ2(90);
        student.setQ3(98);
        student.setQ4(92);
        student.setA1(75);
        student.setA1(89);
        student.setA1(83);
        student.setMidtermExam(78);
        student.setFinalExam(95);
        try {
            int data = DBModel.insertRecord(student);
            System.out.println(data);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        /*========= Update Student Record =========*/
        /*Student student = new Student();
        student.setStudentNo(3564785);
        student.setFirstName("Alex");
        student.setLastName("Pinto");
        student.setQ1(86);
        student.setQ2(90);
        student.setQ3(98);
        student.setQ4(92);
        student.setA1(75);
        student.setA1(89);
        student.setA1(83);
        student.setMidtermExam(78);
        student.setFinalExam(95);
        try {
            int data = DBModel.updateRecord(student);
            System.out.println(data);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
