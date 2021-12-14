package com.EmployeesProject.Jpa.controller;

import com.EmployeesProject.Jpa.model.CompanyConfigurationModel;
import com.EmployeesProject.Jpa.model.EmployeesDetailsModel;
import com.EmployeesProject.Jpa.model.EmployeesHolidayModel;
import com.EmployeesProject.Jpa.model.PublicHolidaysModel;
import com.EmployeesProject.Jpa.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    public EmployeesService employeesService;


    @PostMapping("/add-employees")
    public void  add(@RequestBody EmployeesDetailsModel newEmployee) {employeesService.addEmployee(newEmployee);}

    @RequestMapping ("/get-all-employees")
    public List<EmployeesDetailsModel> getEmployees() {
        return employeesService.getAllEmployees();
    }


    @GetMapping("/get/{id}")
    public EmployeesDetailsModel getEmployeeById(@PathVariable Integer id) {

        return employeesService.getEmployeeById(id);
    }
     /***********************public Holidays*************************************/

    @PostMapping("/add-public-holidays")
    public void add(@RequestBody PublicHolidaysModel newHoliday) {employeesService.addPublicHolidays(newHoliday);}

    @RequestMapping("/get-all-public-holidays")
    public List<PublicHolidaysModel> getHolidays(){return employeesService.getPublicHolidays();}

    /***********************public Holidays*************************************/
    @PostMapping("/add-company-configurations")
    public void add(@RequestBody CompanyConfigurationModel newConfigs){employeesService.addCompanyConfig(newConfigs);}

    @RequestMapping("/get-company-configurations")
    public List<CompanyConfigurationModel> getCompanyConfigs(){ return employeesService.getCompanyConfigures();}


//    @GetMapping("/get-date/{id}")
//    public List<EmployeesDetailsModel> getDates(@PathVariable int id){return employeesService.getDates(id);}


}
