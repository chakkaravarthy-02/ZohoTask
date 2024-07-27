import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDTO {
    public String name;
    public int idNo;
    public String address;

    private String pii;
    private double salary;

    ArrayList<EmployeeDTO> employees=new ArrayList<>();

    public EmployeeDTO(String name, int idNo, String address) {
        this.name = name;
        this.idNo = idNo;
        this.address = address;
        employees.add(this);
    }

    public String getPii() {
        return pii;
    }

    public void setPii(String pii) {
        this.pii = pii;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String showEmployeeDetails(){
        return "Employee Name : "+name+"\nEmployee id : "+"\nEmployee Address : "+address;
    }
    public void showAllEmployeeDetails() {
        for(EmployeeDTO employee:employees){
            System.out.println(employee.showEmployeeDetails());
        }
    }
}
class EmployeeMain{
    public static void main(String[] args) {
        EmployeeDTO employeeDTO=new EmployeeDTO("Sanjay",1,"Tharamangalam,salem");
        employeeDTO.setPii("6808-8769-9876");
        employeeDTO.setSalary(89000);
        employeeDTO.showAllEmployeeDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("if you want to see your aadhar no : y/n");
        String wantToSeeAadhar=scanner.nextLine();
        if(wantToSeeAadhar.equals("y")){
            System.out.println("Your Aadhar no : "+employeeDTO.getPii());
        }
        System.out.println("if you want to see your salary no : y/n");
        String wantToSeeSalary=scanner.nextLine();
        if(wantToSeeSalary.equals("y")){
            System.out.println("Your Salary : "+employeeDTO.getSalary());
        }
    }
}
