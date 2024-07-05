import java.util.Scanner;

public class PolynomialEquation {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //Getting input from the user
        System.out.println("Enter the a,b,c values");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        //check variable determines which formulae to be used
        double check=(b * b) - (4.0 * a * c);

        //divisor
        double r = 2.0 * a;

        //if-else
        if(check>0) {
            double r1 = (-b + Math.pow(check, 0.5)) / r;
            double r2 = (-b - Math.pow(check, 0.5)) / r;
            System.out.println(r1 + " " + r2);
        }else if(check==0){
            double r1 = (-b)/r;
            System.out.println(r1);
        }else{
            System.out.println("they are not real roots");
        }

    }
}
