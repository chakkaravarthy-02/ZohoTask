
class Employee {
    String empName;
    int empId;
    double empSalary;
    int hoursOfWork;

    public Employee(String empName, int empId, double empSalary, int hoursOfWork) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.hoursOfWork = hoursOfWork;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Name: "+empName+"Employee Id:"+empId+"Employee Salary"+empSalary+"Hours of work"+hoursOfWork);
    }
}
class HourlyEmployee extends Employee{
    public HourlyEmployee(String empName, int empId, double empSalary, int hoursOfWork) {
        super(empName, empId, empSalary, hoursOfWork);
    }

    public void getEmployeeDetails(){
        System.out.println("Hourly Employee : ");
        System.out.println("Employee Name: "+empName+" Employee Id :"+empId+" Employee Hours of work :"+hoursOfWork+" Salary :"+hoursOfWork*5000);
    }
}
class SalariedEmployee extends Employee{

    public SalariedEmployee(String empName, int empId, double empSalary, int hoursOfWork) {
        super(empName, empId, empSalary, hoursOfWork);
    }

    public void getEmployeeDetails(){
        System.out.println("Salaried Employee : ");
        System.out.println("Employee Name: "+empName+" Employee Id :"+empId+" Employee Hours of work :"+hoursOfWork+" Salary :"+empSalary);
    }
}
public class OverLoadSample{
    public static void main(String[] args){

        Employee he=new HourlyEmployee("siva",5,0,8);
        he.getEmployeeDetails();

        Employee se=new SalariedEmployee("dinesh",6,80000,9);
        se.getEmployeeDetails();
    }
}


