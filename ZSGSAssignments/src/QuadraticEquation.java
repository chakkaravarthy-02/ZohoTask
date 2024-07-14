import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //Getting input from the user
        System.out.println("Enter the a,b,c values");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        //check variable determines which formulae to be used
        //to discriminant the roots we need to use (b2 – 4ac)
        double discriminant =(b * b) - (4.0 * a * c);

        //divisor in formula (2a)
        double divisor = 2.0 * a;

        //real roots and unequal
        if(discriminant >0) {
            double plusRoot = (-b + Math.pow(discriminant, 0.5)) / divisor;
            double minusRoot = (-b - Math.pow(discriminant, 0.5)) / divisor;
            System.out.println(plusRoot + " " + minusRoot);
        }
        //real and equal
        else if(discriminant ==0){
            double root = (-b)/ divisor;
            System.out.println(root);
        }
        //unequal and imaginary
        else{
            discriminant = discriminant *(-1);
            System.out.println(((-b)/divisor) +"+"+(Math.pow(discriminant, 0.5))/divisor+"i");
            System.out.println(((-b)/divisor )+"-"+(Math.pow(discriminant, 0.5))/divisor+"i");
        }
    }
}
