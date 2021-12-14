package com.jpa.onetomany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee_details")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;

    @OneToMany(mappedBy= "employeeEntity", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<AddressEntity> addressEntity;

    @OneToMany(mappedBy= "employeeEntity", cascade = CascadeType.ALL)
    @JsonManagedReference
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<HolidaysEntity> holidaysEntity;

    @OneToMany(mappedBy= "employeeEntity", cascade = CascadeType.ALL)
    @JsonManagedReference
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<SalaryDesignationEntity> salaryDesignationEntity;

    public List<SalaryDesignationEntity> getSalaryDesignationEntity() {
        return salaryDesignationEntity;
    }

    public void setSalaryDesignationEntity(List<SalaryDesignationEntity> salaryDesignationEntity) {
        this.salaryDesignationEntity = salaryDesignationEntity;
    }

    public List<HolidaysEntity> getHolidaysEntity() {
        return holidaysEntity;
    }

    public void setHolidaysEntity(List<HolidaysEntity> holidaysEntity) {
        this.holidaysEntity = holidaysEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AddressEntity> getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(List<AddressEntity> addressEntity) {
        this.addressEntity = addressEntity;
    }
}
