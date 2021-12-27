import java.util.List;

public class EmployeeDetails {
    private int  empId;
    private String empName;
    private Double salary;
    private int locationId;
    private List<BenefitsDetails> benefitsDetailsList;
    private int depId;


    public EmployeeDetails(int empId, String empName, Double salary, int locationId, int depId) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.locationId = locationId;
        this.depId = depId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public List<BenefitsDetails> getBenefitsDetailsList() {
        return benefitsDetailsList;
    }

    public void setBenefitsDetailsList(List<BenefitsDetails> benefitsDetailsList) {
        this.benefitsDetailsList = benefitsDetailsList;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }
}
