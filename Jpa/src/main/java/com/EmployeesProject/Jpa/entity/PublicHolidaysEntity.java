package com.EmployeesProject.Jpa.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="publicHolidays")
public class PublicHolidaysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private LocalDate date;
    @Column
    private String description;
    @Column
    private String holidayFinancialYear;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getHolidayFinancialYear() {
        return holidayFinancialYear;
    }

    public void setHolidayFinancialYear(String holidayFinancialYear) {
        this.holidayFinancialYear = holidayFinancialYear;
    }

}
