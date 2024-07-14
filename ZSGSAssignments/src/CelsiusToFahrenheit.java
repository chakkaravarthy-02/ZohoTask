import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius : ");
        double temperature=sc.nextInt();
        int FreezePoint=32;
        double ScaleDifference = 9/5.0;

        //celsius - fahrenheit
        //formula :  F = (9/5)C + 32.

        double fahrenheit=(ScaleDifference)*temperature+FreezePoint;
        System.out.println("For a given Celsius : "+temperature +" converted Fahrenheit is : "+fahrenheit);
    }
}