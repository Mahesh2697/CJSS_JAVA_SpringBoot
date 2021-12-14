package com.sri.springjpa.controller;

import com.sri.springjpa.entity.CustomerDetails;
import com.sri.springjpa.model.CustomerDetailsModel;
import com.sri.springjpa.model.CustomerModel;
import com.sri.springjpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add-customer")
    public CustomerDetails add(@RequestBody CustomerModel customer) {

        return customerService.addCustomer(customer);
    }


    @GetMapping("/get/{id}")
    public CustomerModel getCustomerById(@PathVariable Long id) {

        return customerService.getCustomerById(id);
    }

    @GetMapping ("/get-customer-byName")
    public List<CustomerModel> getCustomerByName(@RequestBody CustomerDetailsModel customerModel) {

        return customerService.getCustomerByName(customerModel.getName());
    }

    @GetMapping("/get-all-customers")
    public List<CustomerModel> getAllCustomers() {
        return customerService.getCustomers();
    }


}
