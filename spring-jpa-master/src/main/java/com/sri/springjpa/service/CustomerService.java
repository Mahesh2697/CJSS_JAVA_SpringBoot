package com.sri.springjpa.service;

import com.sri.springjpa.entity.AddressDetails;
import com.sri.springjpa.entity.CustomerDetails;
import com.sri.springjpa.entity.HolidaysEntity;
import com.sri.springjpa.entity.PersonalDetails;
import com.sri.springjpa.model.*;
import com.sri.springjpa.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerDetailsRepository customerRepository;

    public List<CustomerModel> getCustomers() {
        List<CustomerDetails> customDetails = customerRepository.findAll();
        return customDetails.stream().map(customer -> getCustomerModel(customer)).collect(Collectors.toList());
    }

    public CustomerModel getCustomerById(Long id) {
        Optional<CustomerDetails> customerDetails = customerRepository.findById(id);
        if (customerDetails.isPresent()) {
            return getCustomerModel(customerDetails.get());
        }
        return null;
    }

    public List<CustomerModel> getCustomerByName(String name) {
        List<CustomerDetails> customDetails = customerRepository.findByName(name);
        return customDetails.stream().map(customer -> getCustomerModel(customer)).collect(Collectors.toList());
    }

    public CustomerDetails addCustomer(CustomerModel customer) {

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setName(customer.getCustomerDetails().getName());

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setMobile(customer.getPersonalDetails().getMobile());
        personalDetails.setEmail(customer.getPersonalDetails().getEmail());
        customerDetails.setPersonalDetails(personalDetails);

        AddressDetails addressDetails = new AddressDetails();
        addressDetails.setLine1(customer.getAddressModel().getLine1());
        addressDetails.setLine2(customer.getAddressModel().getLine2());
        customerDetails.setAddressDetails(addressDetails);


        HolidaysEntity holidaysEntity = new HolidaysEntity();
        holidaysEntity.setDate(customer.getCustomerHolidaysModel().getDate());
        holidaysEntity.setDescription(customer.getCustomerHolidaysModel().getDescription());
        customerDetails.setHolidaysDetails(holidaysEntity);

        return customerRepository.save(customerDetails);
    }


    private CustomerModel  getCustomerModel(CustomerDetails customerDetails) {

        CustomerModel customerModel = new CustomerModel();
        CustomerDetailsModel customerDetailsModel = new CustomerDetailsModel();
        customerDetailsModel.setName(customerDetails.getName());

        PersonalDetailsModel personalDetailsModel = new PersonalDetailsModel();
        personalDetailsModel.setMobile(customerDetails.getPersonalDetails().getMobile());
        personalDetailsModel.setEmail(customerDetails.getPersonalDetails().getEmail());

       AddressModel addressModel = new AddressModel();
       addressModel.setLine1(customerDetails.getAddressDetails().getLine1());
       addressModel.setLine2((customerDetails.getAddressDetails().getLine2()));

        CustomerHolidaysModel customerHolidaysModel = new CustomerHolidaysModel();
        customerHolidaysModel.setDate(customerDetails.getHolidaysDetails().getDate());
        customerHolidaysModel.setDescription(customerDetails.getHolidaysDetails().getDescription());

        customerModel.setCustomerDetails(customerDetailsModel);
        customerModel.setPersonalDetails(personalDetailsModel);
        customerModel.setAddressModel(addressModel);

        return customerModel;
    }

}
