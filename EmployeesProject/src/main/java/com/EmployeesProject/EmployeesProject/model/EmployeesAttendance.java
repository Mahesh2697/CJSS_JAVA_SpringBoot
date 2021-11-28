package com.EmployeesProject.EmployeesProject.model;

public class EmployeesAttendance {

    private String date;
    private boolean holiday;
    private String reasonForHoliday;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isHoliday() {
        return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

    public String getReasonForHoliday() {
        return reasonForHoliday;
    }

    public void setReasonForHoliday(String reasonForHoliday) {
        this.reasonForHoliday = reasonForHoliday;
    }
}
