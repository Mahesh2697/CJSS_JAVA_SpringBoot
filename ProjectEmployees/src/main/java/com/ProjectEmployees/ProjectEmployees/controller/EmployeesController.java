package com.ProjectEmployees.ProjectEmployees.controller;
import com.ProjectEmployees.ProjectEmployees.model.CompanyCalenderModel;
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

    @GetMapping("/get-employees/{id}")
    public EmployeesModel getEmployeeById(@PathVariable int id) {
        return employeesService.getEmployeeById(id);
    }


    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeesService.deleteEmployeeById(id);
    }


    //***********************************Employee-holidays***************
    @PostMapping("/add-employee-holiday")

    public void postEmployeeHoliday(@Valid @RequestBody EmployeesHolidayModel employeesHolidayModel) {
        employeesService.addEmployeeHoliday(employeesHolidayModel);
    }

    @GetMapping("/get-all-employees-Holidays")
    public List<EmployeesHolidayModel> getHolidaysEmployees() {
        return employeesService.getAllEmployeesHolidays();
    }

    @GetMapping("/get-Employee-Holidays-ById/{id}")
    public EmployeesHolidayModel getHolidayById(@PathVariable int id) {
        return employeesService.getHolidayById(id);
    }


    //***********************publicHolidays********************//

    @PostMapping("/add-Holiday")
    public String postHoliday(@Valid @RequestBody PublicHolidaysModel publicHolidaysModel) {
        return employeesService.addHoliday(publicHolidaysModel);
    }

    @GetMapping("/get-all-publicHolidays")
    public List<PublicHolidaysModel> getPublicHoliday() {
        return employeesService.getAllPublicHolidays();
    }


    //***********************CompanyConfigurations********************//

    @PostMapping("/add-workingDays")
    public void postCompanyCalender(@RequestBody CompanyCalenderModel companyCalenderModel) {
        employeesService.addCompanyHoliday(companyCalenderModel);
    }

    @GetMapping("/get-all-company-configurations")
    public List<CompanyCalenderModel> getCompanyConfigurations() {
        return employeesService.getALLCompanyConfigurations();
    }

}
//
//    @GetMapping("/get-empholidays")
//    public List<EmployeesHolidayModel> getemployeesHolidayModelList(){
//        return  employeesService.employeesHolidayModelList();
//    }


