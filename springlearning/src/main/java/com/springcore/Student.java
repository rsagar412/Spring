package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    public Student() {
        super();
    }
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public int getStudentId() {
        return this.studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return this.studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + this.studentId + ", studentName=" + this.studentName + ", studentAddress="
                + this.studentAddress + "]";
    }
}
