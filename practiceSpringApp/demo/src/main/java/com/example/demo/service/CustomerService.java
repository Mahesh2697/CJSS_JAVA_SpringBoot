package com.example.demo.service;


import com.example.demo.model.Customers;
import com.example.demo.model.Products;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomerService {

    private List<Customers> customers;

    public void addCustomers(Customers customer) {
        if(CollectionUtils.isEmpty(customers)){
            customers = new ArrayList<>();
        }
        customers.add(customer);
    }

    public List<Customers> getAllCustomers() {
        return customers;
    }
   private  List<Products> products;
    public void addProducts(Products product) {
        if(CollectionUtils.isEmpty(products)){
            products = new ArrayList<>();
        }
        products.add(product);
    }


    public List<Products> getAllProducts() {
        return products;
    }
}
