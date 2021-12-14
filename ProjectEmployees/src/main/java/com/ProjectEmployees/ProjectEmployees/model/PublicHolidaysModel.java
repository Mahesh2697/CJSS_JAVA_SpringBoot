package com.ProjectEmployees.ProjectEmployees.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class PublicHolidaysModel {

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate datesOfHoliday;

    private String holidayDescription;
    private String financialYear;

    public LocalDate getDatesOfHoliday() {
        return datesOfHoliday;
    }

    public void setDatesOfHoliday(LocalDate datesOfHoliday) {
        this.datesOfHoliday = datesOfHoliday;
    }

    public String getHolidayDescription() {
        return holidayDescription;
    }

    public void setHolidayDescription(String holidayDescription) {
        this.holidayDescription = holidayDescription;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }
}


