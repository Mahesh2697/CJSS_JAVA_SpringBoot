package com.EmployeesProject.EmployeesProject.model;

import java.util.List;

public class EmployeesModel {

    private int empId;
    private String empName;
    private String empEmail;
    private List<EmployeesAddressModel> addressList;
    private List<EmployeesAttendance>   attendanceList;
    private  List<EmployeesSalary> salaryList;

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

    public List<EmployeesAddressModel> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<EmployeesAddressModel> addressList) {
        this.addressList = addressList;
    }

    public List<EmployeesAttendance> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<EmployeesAttendance> attendanceList) {
        this.attendanceList = attendanceList;
    }

    public List<EmployeesSalary> getSalaryList() {
        return salaryList;
    }

    public void setSalaryList(List<EmployeesSalary> salaryList) {
        this.salaryList = salaryList;
    }
}
