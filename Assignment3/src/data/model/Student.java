package data.model;

public class Student {
    private int studentNo;
    private String firstName;
    private String lastName;
    private Integer Q1;
    private int Q2;
    private int Q3;
    private int Q4;
    private int A1;
    private int A2;
    private int A3;
    private int MidtermExam;
    private int FinalExam;

    public Student() {

    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getQ1() {
        return Q1;
    }

    public void setQ1(Integer q1) {
        Q1 = q1;
    }

    public int getQ2() {
        return Q2;
    }

    public void setQ2(int q2) {
        Q2 = q2;
    }

    public int getQ3() {
        return Q3;
    }

    public void setQ3(int q3) {
        Q3 = q3;
    }

    public int getQ4() {
        return Q4;
    }

    public void setQ4(int q4) {
        Q4 = q4;
    }

    public int getA1() {
        return A1;
    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public int getA2() {
        return A2;
    }

    public void setA2(int a2) {
        A2 = a2;
    }

    public int getA3() {
        return A3;
    }

    public void setA3(int a3) {
        A3 = a3;
    }

    public int getMidtermExam() {
        return MidtermExam;
    }

    public void setMidtermExam(int midtermExam) {
        MidtermExam = midtermExam;
    }

    public int getFinalExam() {
        return FinalExam;
    }

    public void setFinalExam(int finalExam) {
        FinalExam = finalExam;
    }
}
