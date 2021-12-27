import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesInformation {
    public static void main(String args[]){

        List<DepartmentDetails> department = new ArrayList<>();
        DepartmentDetails d1= new DepartmentDetails(111, "healthcare");
        DepartmentDetails d2= new DepartmentDetails(121, "finance");
        DepartmentDetails d3= new DepartmentDetails(131, "admin");
        DepartmentDetails d4= new DepartmentDetails(141, "fraud");
        department.add(d1);
        department.add(d2);
        department.add(d3);
        department.add(d4);


        List<LocationDetails> location = new ArrayList<>();
        LocationDetails l1 = new LocationDetails(11, "Hyderabad","India");
        LocationDetails l2 = new LocationDetails(22, "chennai","India");
        LocationDetails l3 = new LocationDetails(33, "London","United Kingdom");
        location.add(l1);
        location.add(l2);
        location.add(l3);


        List<BenefitsDetails> benefits1 = new ArrayList<>();
        BenefitsDetails b1  = new BenefitsDetails(10,"Health Insurance", " for any type of health issues ");
        BenefitsDetails b2  = new BenefitsDetails(11,"disability insurance ", " The employer pays for the worker’s salary if the worker becomes disabled or is unable to work.");
        BenefitsDetails b3  = new BenefitsDetails(12," corporate discounts ", " can get an employee discounts on products on online shopings ");
        BenefitsDetails b4  = new BenefitsDetails(13,"Life insurance ", "can get an employee life time insurance");
        BenefitsDetails b5  = new BenefitsDetails(14,"Employee clubs, activities & gifts ", "There are heaps of possibilities when it comes to this category of the employee benefits package:");
        benefits1.add(b1);
        benefits1.add(b2);
        benefits1.add(b3);
        benefits1.add(b4);
        benefits1.add(b5);
        List<BenefitsDetails> benefits2 = new ArrayList<>();
        BenefitsDetails b6  = new BenefitsDetails(10,"Health Insurance", " for any type of health issues ");
        BenefitsDetails b7  = new BenefitsDetails(11,"disability insurance ", " The employer pays for the worker’s salary if the worker becomes disabled or is unable to work.");
        BenefitsDetails b8  = new BenefitsDetails(12," corporate discounts ", " can get an employee discounts on products on online shopings ");
        benefits2.add(b6);
        benefits2.add(b7);
        benefits2.add(b8);
        List<BenefitsDetails> benefits3 = new ArrayList<>();
        BenefitsDetails b9  = new BenefitsDetails(10,"Health Insurance", " for any type of health issues ");
        BenefitsDetails b10  = new BenefitsDetails(11,"disability insurance ", " The employer pays for the worker’s salary if the worker becomes disabled or is unable to work.");
        BenefitsDetails b11  = new BenefitsDetails(12," corporate discounts ", " can get an employee discounts on products on online shopings ");
        benefits3.add(b9);
        benefits3.add(b10);
        benefits3.add(b11);


        List<EmployeeDetails> employees = new ArrayList<>();
        EmployeeDetails e1 = new EmployeeDetails(100, "karthik", 45000.0,11,111 );
        e1.setBenefitsDetailsList(benefits1);
        EmployeeDetails e2 = new EmployeeDetails(101, "sam", 55000.0,22,112);
        e2.setBenefitsDetailsList(benefits2);
        EmployeeDetails e3 = new EmployeeDetails(102, "bran", 40000.0,11,113);
        e3.setBenefitsDetailsList(benefits3);
        EmployeeDetails e4 = new EmployeeDetails(103, "tyron", 65000.0,22,114);
        e4.setBenefitsDetailsList(benefits2);


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);


        employees.stream().forEach(o-> {
            location.stream().filter(p-> o.getLocationId()== p.getLocationId() && p.getCountyLocation().equals("India")).forEach(a-> {
                System.out.println(o.getEmpId()+" "+ a.getCountyLocation());
            });
        });

        System.out.println("-----------------------------------");
        employees.stream().forEach(o-> {
            location.stream().filter(p-> o.getLocationId()== p.getLocationId() && p.getCountyLocation().equals("India")).forEach(a-> {
                System.out.println(o.getEmpId()+" "+ a.getLocationName());
            });
        });

        System.out.println("-----------------------------------");
        employees.stream().forEach(o-> {
            location.stream().filter(p-> o.getLocationId() == 22 && p.getLocationName().equals("chennai")).forEach(a-> {
                System.out.println(o.getEmpId()+" "+ a.getLocationName()+" "+a.getCountyLocation());
            });
        });

        System.out.println("-----------------------------------");
        employees.stream().forEach( p-> {
            System.out.println("-----------------------------------");
            p.getBenefitsDetailsList().stream().forEach(o-> {

                System.out.println(p.getEmpId()+" "+o.getBenefitId()+" "+o.getBenefitName()+" "+o.getDescription());

            });

        });

        System.out.println("-----------------------------------");


        employees.stream().forEach(l-> {
            location.stream().filter(q-> l.getLocationId()==q.getLocationId()).forEach(a-> {
                department.stream().filter(u-> u.getDepName()==u.getDepName()).forEach(d-> {
                    System.out.println(l.getEmpId()+" "+l.getEmpName()+" "+l.getSalary()+" "+d.getDepName()+" "+a.getLocationName()+" "+a.getCountyLocation());
                });
            });
        });

    }
}
