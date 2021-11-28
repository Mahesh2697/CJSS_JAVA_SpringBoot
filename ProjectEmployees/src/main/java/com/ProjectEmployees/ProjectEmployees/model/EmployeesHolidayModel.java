package com.ProjectEmployees.ProjectEmployees.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;


public class EmployeesHolidayModel {

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate fromDate;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate toDate;

    private boolean halfDayHoliday;
     private String halfDayDescription;

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public boolean isHalfDayHoliday() {
        return halfDayHoliday;
    }

    public void setHalfDayHoliday(boolean halfDayHoliday) {
        this.halfDayHoliday = halfDayHoliday;
    }

    public String getHalfDayDescription() {
        return halfDayDescription;
    }

    public void setHalfDayDescription(String halfDayDescription) {
        this.halfDayDescription = halfDayDescription;
    }
}
