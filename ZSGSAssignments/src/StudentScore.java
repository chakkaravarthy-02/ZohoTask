import java.util.Scanner;

public class StudentScore{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark= sc.nextInt();
            if (mark >= 90 && mark <=100){
                System.out.println("S-grade outstanding");
            }
            else if(mark>=80 && mark<90){
                System.out.println("A-grade");
            }
            else if(mark>=70 && mark<80){
                System.out.println("B-grade");
            }
            else if(mark>=60 && mark<70) {
                System.out.println("C-grade");
            }
            else if(mark>=50 && mark<60) {
                System.out.println("D-grade");
            }
            else if(mark>=40 && mark<50) {
                System.out.println("E-grade");
            }
            else if(mark<40){
                System.out.println("Fail.Better luck next time.");
            }else{
                System.out.println("Enter the mark between 0-100");
            }
    }
}
