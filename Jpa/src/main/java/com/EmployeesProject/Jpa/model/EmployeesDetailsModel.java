package com.EmployeesProject.Jpa.model;

import java.util.List;

public class EmployeesDetailsModel {


    private int empId;
    private String  empName;
    private String empEmail;
    private String empPhoneNumber;
    private String designation;
    private double empSalaryDuringTraining;
    private double empSalary;
    private String lineOne;
    private String lineTwo;

    private List<EmployeesHolidayModel> employeesHolidayModels;
    private SalaryModel salaryModel;

    public SalaryModel getSalaryModel() {
        return salaryModel;
    }

    public void setSalaryModel(SalaryModel salaryModel) {
        this.salaryModel = salaryModel;
    }

    public List<EmployeesHolidayModel> getEmployeesHolidayModels() {
        return employeesHolidayModels;
    }


    public void setEmployeesHolidayModels(List<EmployeesHolidayModel> employeesHolidayModels) {
        this.employeesHolidayModels = employeesHolidayModels;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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
}
