package com.sri.springjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private PersonalDetails personalDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private AddressDetails addressDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private  HolidaysEntity holidaysDetails;

    public HolidaysEntity getHolidaysDetails() {
        return holidaysDetails;
    }

    public void setHolidaysDetails(HolidaysEntity holidaysDetails) {
        this.holidaysDetails = holidaysDetails;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public CustomerDetails() {
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

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}
