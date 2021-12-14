package com.ProjectEmployees.ProjectEmployees.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class EmployeesModel {

//    @Min(1)
//    @Max(5)
    private int empId;
//    @NotNull
    private String empName;
//    @Pattern(regexp="^[a-zA-Z0-9]{15}" , message ="mail should contain a-z,A-Z,0-9 and length 15" )
      private String empEmail;
//    @NotNull
//    @Min(1)
//    @Max(10)
    private String empPhoneNumber;
//    @NotNull
    private String empDesignation;
    private double empSalaryDuringTraining;
    private double empSalary;
    private String line1;
    private String line2;
    private List<EmployeesHolidayModel> employeesHolidayModelList;
    private List<CompanyCalenderModel>  companyCalenderModelList;
    private List<PublicHolidaysModel>   publicHolidaysModelList;


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

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
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

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public List<EmployeesHolidayModel> getEmployeesHolidayModelList() {
        return employeesHolidayModelList;
    }

    public void setEmployeesHolidayModelList(List<EmployeesHolidayModel> employeesHolidayModelList) {
        this.employeesHolidayModelList = employeesHolidayModelList;
    }

    public List<CompanyCalenderModel> getCompanyCalenderModelList() {
        return companyCalenderModelList;
    }

    public void setCompanyCalenderModelList(List<CompanyCalenderModel> companyCalenderModelList) {
        this.companyCalenderModelList = companyCalenderModelList;
    }

    public List<PublicHolidaysModel> getPublicHolidaysModelList() {
        return publicHolidaysModelList;
    }

    public void setPublicHolidaysModelList(List<PublicHolidaysModel> publicHolidaysModelList) {
        this.publicHolidaysModelList = publicHolidaysModelList;
    }
}
