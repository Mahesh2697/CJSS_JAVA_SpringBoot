package com.studentJpa.project.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="student_info")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String mobileNo;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = CourseEntity.class)
    private List<CourseEntity> courseEntityList;

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

    public List<CourseEntity> getCourseEntityList() {
        return courseEntityList;
    }

    public void setCourseEntityList(List<CourseEntity> courseEntityList) {
        this.courseEntityList = courseEntityList;
    }
}
