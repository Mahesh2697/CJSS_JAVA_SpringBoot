package com.EmployeesProject.EmployeesProject.controller;

import com.EmployeesProject.EmployeesProject.model.EmployeesModel;
import com.EmployeesProject.EmployeesProject.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @PostMapping("/add-employee")
     public void postEmployee(@RequestBody EmployeesModel employeesModel) {
        employeesService.addEmployee(employeesModel);
    }

    @GetMapping("/get-all-employees")
    public List<EmployeesModel> getEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping("/get-employees/{id}")
    public EmployeesModel getEmployeeById(@PathVariable int id) {
        return employeesService.getEmployeeById(id);
    }

    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeesService.deleteEmployeeById(id);
    }
}
