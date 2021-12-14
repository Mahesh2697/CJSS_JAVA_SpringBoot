package com.EmployeesProject.Jpa.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "employeesDetails")
public class EmployeesDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column
    private String  empName;
    @Column
    private String empEmail;
    @Column
    private String empPhoneNumber;
    @Column
    private String designation;
    @Column
    private double empSalaryDuringTraining;
    @Column
    private double empSalary;
    @Column
    private String lineOne;
    @Column
    private String lineTwo;

    @OneToMany( mappedBy= "employeesDetailsEntity", fetch = FetchType.EAGER,cascade = CascadeType.ALL )
    private List<EmployeesHolidayEntity> employeesHolidayEntityList;
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToOne( mappedBy= "employeesDetailsEntity", fetch = FetchType.EAGER,cascade = CascadeType.ALL )
    private SalaryEntity salaryEntity;


    public SalaryEntity getSalaryEntity() {
        return salaryEntity;
    }

    public void setSalaryEntity(SalaryEntity salaryEntity) {
        this.salaryEntity = salaryEntity;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(String empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }



    public double getEmpSalaryDuringTraining() {
        return empSalaryDuringTraining;
    }

    public void setEmpSalaryDuringTraining(double empSalaryDuringTraining) {
        this.empSalaryDuringTraining = empSalaryDuringTraining;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public List<EmployeesHolidayEntity> getEmployeesHolidayEntityList() {
        return employeesHolidayEntityList;
    }

    public void setEmployeesHolidayEntityList(List<EmployeesHolidayEntity> employeesHolidayEntityList) {
        this.employeesHolidayEntityList = employeesHolidayEntityList;

    }
}
