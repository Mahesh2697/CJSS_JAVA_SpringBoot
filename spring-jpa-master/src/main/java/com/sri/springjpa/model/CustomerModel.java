package com.sri.springjpa.model;

public class CustomerModel {

    private CustomerDetailsModel customerDetails;
    private PersonalDetailsModel personalDetails;
    private AddressModel  addressModel;
    private CustomerHolidaysModel customerHolidaysModel;

    public CustomerHolidaysModel getCustomerHolidaysModel() {
        return customerHolidaysModel;
    }

    public void setCustomerHolidaysModel(CustomerHolidaysModel customerHolidaysModel) {
        this.customerHolidaysModel = customerHolidaysModel;
    }

    public AddressModel getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    public CustomerDetailsModel getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetailsModel customerDetails) {
        this.customerDetails = customerDetails;
    }

    public PersonalDetailsModel getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetailsModel personalDetails) {
        this.personalDetails = personalDetails;
    }
}
