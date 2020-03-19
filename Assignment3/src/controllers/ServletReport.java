package controllers;

import data.model.Grade;
import data.model.Student;
import services.GradeService;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletReport")
public class ServletReport extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Student student = StudentService.getStudent();
            System.out.println(student.getFirstName());

            Grade grade = new Grade();
            grade.setQ1(GradeService.calculateGrade(student.getQ1()));
            grade.setQ2(GradeService.calculateGrade(student.getQ2()));
            grade.setQ3(GradeService.calculateGrade(student.getQ3()));
            grade.setQ4(GradeService.calculateGrade(student.getQ4()));
            grade.setA1(GradeService.calculateGrade(student.getA1()));
            grade.setA2(GradeService.calculateGrade(student.getA2()));
            grade.setA3(GradeService.calculateGrade(student.getA3()));
            grade.setMidtermExam(GradeService.calculateGrade(student.getMidtermExam()));
            grade.setFinalExam(GradeService.calculateGrade(student.getFinalExam()));
            grade.setFinalGrade(GradeService.calculateResult(student));
            request.setAttribute("student", student);
            request.setAttribute("grade", grade);
            request.getRequestDispatcher("report/report.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
