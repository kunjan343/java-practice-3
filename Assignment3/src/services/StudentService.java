package services;

import data.model.Student;

public class StudentService {
    private static Student student = null;
    public static boolean studentExist = false;

    public static Student getStudent() {
        return student;
    }

    public static void setStudent(Student student) {
        StudentService.student = student;
        StudentService.studentExist = true;
    }

    public static void clearStudent() {
        StudentService.student = null;
        StudentService.studentExist = false;
    }
}
