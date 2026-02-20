package Domain;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UndergraduateStudent extends Student{
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    //Extra fields
    protected String creditHours;
    protected double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }
    @Override
    public double calculateTuition() {
        double price = 3333;
        double subject = 9;
        return price * subject;
    }
    @Override
    public String getStudentType() {
        return "You are an undergraduate student.";
    }
    @Override
    public void displayStudentDetails() {
        System.out.println(
                "Student ID: " + studentId +
                "\nStudent name: " + name +
                "\nStudent email: " + email +
                "\nDepartment: " + department);
    }
    //Builder class
    public static class Builder {
        protected String studentId;
        protected String name;
        protected String email;
        protected String department;
        protected String creditHours;
        protected double scholarshipAmount;

        //Setters
        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }
        public Builder setCreditHours(String creditHours) {
            this.creditHours = creditHours;
            return this;
        }
        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }
        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
