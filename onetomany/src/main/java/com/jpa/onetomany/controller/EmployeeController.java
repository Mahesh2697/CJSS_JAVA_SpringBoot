package com.jpa.onetomany.controller;

import com.jpa.onetomany.model.EmployeeModel;
import com.jpa.onetomany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add-customer")
    public void  add(@RequestBody EmployeeModel newEmployee) {employeeService.addDetails(newEmployee);}

    @RequestMapping ("/get-all-employees")
    public  List<EmployeeModel> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeeModel getEmployeeById(@PathVariable Long id) {

        return employeeService.getEmployeeById(id);
    }

}
