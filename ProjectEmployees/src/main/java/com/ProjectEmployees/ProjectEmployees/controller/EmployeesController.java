package com.ProjectEmployees.ProjectEmployees.controller;
import com.ProjectEmployees.ProjectEmployees.model.EmployeesHolidayModel;
import com.ProjectEmployees.ProjectEmployees.model.EmployeesModel;
import com.ProjectEmployees.ProjectEmployees.model.PublicHolidaysModel;
import com.ProjectEmployees.ProjectEmployees.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @PostMapping("/add-employee")
    public void postEmployee(@Valid @RequestBody EmployeesModel employeesModel) {
        employeesService.addEmployee(employeesModel);
    }

    @GetMapping("/get-all-employees")
    public List<EmployeesModel> getEmployees() {
        return employeesService.getAllEmployees();
    }



    @GetMapping("/get-all-publicHolidays")
    public List<PublicHolidaysModel> getPublicHolidays() {
        return employeesService.getPublicHolidays();
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

