package services;

import data.model.Student;

public class GradeService {
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 75) {
            return "B+";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 65) {
            return "C+";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        }
        return "F";
    }

    public static String calculateResult(Student student) {
        int totalGrade = 0;
        totalGrade += student.getQ1();
        totalGrade += student.getQ2();
        totalGrade += student.getQ3();
        totalGrade += student.getQ4();
        totalGrade += student.getA1();
        totalGrade += student.getA2();
        totalGrade += student.getA3();
        totalGrade += student.getMidtermExam();
        totalGrade += student.getFinalExam();
        totalGrade /= 9;

        return calculateGrade(totalGrade);
    }
}
