import java.util.Scanner;

abstract class Employees {
    String empName;
    int empId;

    public abstract void calculatePay();

    public Employees(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Name: "+empName+"\nEmployee Id:"+empId);
    }
}
class HourlyEmployees extends Employees{
    public int hoursOfWork;
    public HourlyEmployees(String empName, int empId,int hoursOfWork) {
        super(empName, empId);
        this.hoursOfWork=hoursOfWork;
    }
    public void calculatePay(){
        System.out.println("\n"+empName+"Employee is a Hourly employee his/her salary is:"+hoursOfWork*5000);
    }
}
class SalariedEmployees extends Employees{

    public SalariedEmployees(String empName, int empId) {
        super(empName, empId);
    }
    public void calculatePay(){
        System.out.println("\n"+empName+" employee is a salaried employee his/her salary is: "+80000);
    }
}
public class EmployeeAbstractExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the id");
        int id= sc.nextInt();

        sc.nextLine();
        System.out.println("Give your type of work - salary/hourly");
        String type=sc.nextLine();

        System.out.println("If you are hourly give your hour or give 0");
        int hour=sc.nextInt();

        Employees he = new HourlyEmployees(name, id, hour);
        if(type.equals("hourly")) {
            he.getEmployeeDetails();
            he.calculatePay();
        }
        Employees se = new SalariedEmployees(name, id);
        if(type.equals("salary")) {
            se.getEmployeeDetails();
            se.calculatePay();
        }
    }
}



