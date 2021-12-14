package com.EmployeesProject.Jpa.model;

public class CompanyConfigurationModel {

    private int numberOfHolidays;
    private int workingHours;

    public int getNumberOfHolidays() {
        return numberOfHolidays;
    }

    public void setNumberOfHolidays(int numberOfHolidays) {
        this.numberOfHolidays = numberOfHolidays;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
