package com.example.demo.controller;

import com.example.demo.model.Customers;
import com.example.demo.model.Products;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/add-customers")
    public void postCustomers(@RequestBody Customers customer) {
        customerService.addCustomers(customer);
    }

    @GetMapping("/get-all-customers")
    public List<Customers> getAll(){
        return customerService.getAllCustomers();

    }

    @PostMapping("/add-products")
    public  void postProducts(@RequestBody Products products) {
        customerService.addProducts(products);
    }

    @GetMapping("/get-all-products")
    public  List<Products> getAllProducts(){
        return customerService.getAllProducts();
    }




}
