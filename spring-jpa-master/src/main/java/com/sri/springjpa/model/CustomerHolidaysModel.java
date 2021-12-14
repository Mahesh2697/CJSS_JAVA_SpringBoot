package com.sri.springjpa.model;

import java.time.LocalDate;

public class CustomerHolidaysModel {
    private LocalDate date;
    private String description;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
