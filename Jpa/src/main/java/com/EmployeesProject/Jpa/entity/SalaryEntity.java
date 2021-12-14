package com.EmployeesProject.Jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="salary_details")
public class SalaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column
    private double empSalary;
    @Column
    private String wageType;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "empId")
    @JsonIgnoreProperties("salaryEntity")
    private EmployeesDetailsEntity employeesDetailsEntity;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getWageType() {
        return wageType;
    }

    public void setWageType(String wageType) {
        this.wageType = wageType;
    }

    public EmployeesDetailsEntity getEmployeesDetailsEntity() {
        return employeesDetailsEntity;
    }

    public void setEmployeesDetailsEntity(EmployeesDetailsEntity employeesDetailsEntity) {
        this.employeesDetailsEntity = employeesDetailsEntity;
    }
}
