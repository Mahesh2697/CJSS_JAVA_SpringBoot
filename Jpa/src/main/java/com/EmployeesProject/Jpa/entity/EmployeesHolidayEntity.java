package com.EmployeesProject.Jpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="employeesHolidays")
public class EmployeesHolidayEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int empId;
    @Column
    private LocalDate fromDate;
    @Column
    private LocalDate toDate;
    @Column
    private boolean halfDayHoliday;
    @Column
    private String holidayDescription;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "empId")
    private EmployeesDetailsEntity employeesDetailsEntity;



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

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

    public String getHolidayDescription() {
        return holidayDescription;
    }

    public void setHolidayDescription(String holidayDescription) {
        this.holidayDescription = holidayDescription;
    }

    public EmployeesDetailsEntity getEmployeesDetailsEntity() {
        return employeesDetailsEntity;
    }

    public void setEmployeesDetailsEntity(EmployeesDetailsEntity employeesDetailsEntity) {
        this.employeesDetailsEntity = employeesDetailsEntity;
    }
}
