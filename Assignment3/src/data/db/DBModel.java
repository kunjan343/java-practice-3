package data.db;

import data.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBModel {
    public static int insertRecord(Student student) throws SQLException, ClassNotFoundException {
        return DBOps.insertRow(student);
    }

    public static int updateRecord(Student student) throws SQLException, ClassNotFoundException {
        return DBOps.modifyRow(student);
    }

    public static ResultSet findStudent(int studentId) throws SQLException, ClassNotFoundException {
        if (studentId < 0) {
            throw new IllegalArgumentException("Invalid Student Number");
        }
        return DBOps.getRow(studentId);
    }
}
