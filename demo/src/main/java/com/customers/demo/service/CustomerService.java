package com.customers.demo.service;

import com.customers.demo.model.CustomersModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {

    private List  customers= new ArrayList();

    public String addCustomer(CustomersModel newCustomer){
        customers.add(newCustomer);
        return "customers added successfully";

    }
    public List<CustomersModel> getCustomers(){
        return customers;
    }

}
