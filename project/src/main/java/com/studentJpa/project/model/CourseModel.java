package com.studentJpa.project.model;

import java.time.LocalDate;

public class CourseModel {

   private Long id;
   private String courses;
   private  double fee;
   private String joiningDate;

   private StudentModel studentModel;

    public StudentModel getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "id=" + id +
                ", courses='" + courses + '\'' +
                ", fee=" + fee +
                ", joiningDate='" + joiningDate + '\'' +
                ", studentModel=" + studentModel +
                '}';
    }
}
