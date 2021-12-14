package com.studentJpa.project.model;

import java.util.List;

public class StudentModel {

    private Long id;
    private String name;
    private String email;
    private String mobileNo;

    private List<CourseModel> courseModelList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<CourseModel> getCourseModelList() {
        return courseModelList;
    }

    public void setCourseModelList(List<CourseModel> courseModelList) {
        this.courseModelList = courseModelList;
    }
}
