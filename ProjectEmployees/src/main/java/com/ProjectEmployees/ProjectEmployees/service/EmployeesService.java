package com.ProjectEmployees.ProjectEmployees.service;
import com.ProjectEmployees.ProjectEmployees.model.CompanyCalenderModel;
import com.ProjectEmployees.ProjectEmployees.model.EmployeesHolidayModel;
import com.ProjectEmployees.ProjectEmployees.model.EmployeesModel;
import com.ProjectEmployees.ProjectEmployees.model.PublicHolidaysModel;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class EmployeesService {
    private List<EmployeesModel> employees;

    public void addEmployee(EmployeesModel employee) {
        if (CollectionUtils.isEmpty(employees)) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
    }

    public List<EmployeesModel> getAllEmployees() {
        return employees;
    }

    public EmployeesModel getEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getEmpId() == id).findFirst().orElse(null);
    }


    public void deleteEmployeeById(int id) {
        Optional<EmployeesModel> employeeModel = employees.stream().filter(employee -> employee.getEmpId() == id).findFirst();

        employeeModel.ifPresent(employeeModelData -> employees.remove(employeeModelData));

    }

//***********************EmployeeHolidays********************//

    private List<EmployeesHolidayModel> employeesHolidays;
    public void addEmployeeHoliday(EmployeesHolidayModel employeesHolidayModel) {
        if (CollectionUtils.isEmpty(employeesHolidays)) {
            employeesHolidays = new ArrayList<>();
        }
        employeesHolidays.add(employeesHolidayModel);
    }

    public List<EmployeesHolidayModel> getAllEmployeesHolidays() {
        return employeesHolidays;
    }

    public EmployeesHolidayModel getHolidayById(int id) {
        return employeesHolidays.stream().filter(emp -> emp.getEmpId() == id).findFirst().orElse(null);
    }


//public List<EmployeesHolidayModel> employeesHolidayModelList() {
//       employeesHolidayModelList().stream().filter( x -> x.getFromDate() != null)
//               .filter( y -> y.getFromDate() != null);
//        return employeesHolidayModelList();
//}










//***********************publicHolidays********************//

    private List<PublicHolidaysModel> publicHolidays;
    public String addHoliday(PublicHolidaysModel holidaysModel) {
        if (CollectionUtils.isEmpty(publicHolidays)) {
            publicHolidays = new ArrayList<>();
        }
         publicHolidays.add(holidaysModel);
        return "added holidays";
    }

    public List<PublicHolidaysModel> getAllPublicHolidays() {return publicHolidays;}



//***********************CompanyCalenderModel********************//

private List<CompanyCalenderModel>  workingDays;
    public void addCompanyHoliday(CompanyCalenderModel companyCalenderModel) {
        if (CollectionUtils.isEmpty(workingDays)) {
            workingDays = new ArrayList<>();
        }
        workingDays.add(companyCalenderModel);
    }

    public  List<CompanyCalenderModel> getALLCompanyConfigurations() {return workingDays;}




}















