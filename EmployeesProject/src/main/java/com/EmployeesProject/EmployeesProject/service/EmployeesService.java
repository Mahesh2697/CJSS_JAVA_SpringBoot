package com.EmployeesProject.EmployeesProject.service;


import com.EmployeesProject.EmployeesProject.model.EmployeesModel;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {
    private List<EmployeesModel> employees;

    public void addEmployee(EmployeesModel employee) {
        if(CollectionUtils.isEmpty(employees)) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
    }
    public  List<EmployeesModel> getAllEmployees(){
    return employees;
    }
    public EmployeesModel getEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getEmpId()== id).findFirst().orElse(null);
    }

    public void deleteEmployeeById(int id) {
        Optional<EmployeesModel> employeeModel =employees.stream().filter(employee -> employee.getEmpId()== id).findFirst();

        employeeModel.ifPresent(employeeModelData -> employees.remove(employeeModelData));

    }
}




