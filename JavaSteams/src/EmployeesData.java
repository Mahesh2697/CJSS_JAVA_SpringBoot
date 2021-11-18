import model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class EmployeesData {
    public static void main(String args[]){

            List<EmployeeModel> employees = new ArrayList<>();
            EmployeeModel employee1 = new EmployeeModel("101", "mahesh", "10,000");
            EmployeeModel employee2 = new EmployeeModel("102", "kiran", "15,000");
            EmployeeModel employee3 = new EmployeeModel("103", "mohan", "12,000");
            EmployeeModel employee4 = new EmployeeModel("104", "mahesh", "13,000");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);


        employees.forEach(employee -> {
            System.out.println(employee.getEmployeeNo() + ": name:" + employee.getEmployeeName() + ": Salary:" + employee.getSalary());
        });

        employees.stream().map(employeeModel -> {
                    employeeModel.setEmployeeName(employeeModel.getEmployeeName() + ": Dummy Name");
                    return employeeModel;
                })
                .forEach(employee -> {
                    System.out.println(employee.getEmployeeNo() + ": name:" + employee.getEmployeeName() + ": Salary:" + employee.getSalary());
                });
        for (EmployeeModel employee: employees) {
            System.out.println(employee.getEmployeeNo() + " : " + employee.getEmployeeName());

        }


    }
    }

