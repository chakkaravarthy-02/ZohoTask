import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check : ");
        String s=sc.nextLine();
        int firstAt=0;
        int lastAt=0;
        if(s.contains("@")){
            firstAt=s.indexOf("@");
            lastAt=s.lastIndexOf("@");
            if(firstAt!=lastAt){
                System.out.println("Invalid - you must not use more than 1 "+"@");
                System.exit(0);
            }
        }
        if(s.contains(".com")){
            if(s.indexOf(".com")==firstAt+1){
                System.out.println("Cannot use .com after @");
                System.exit(0);
            }
        }
        System.out.println("Valid Email!");
    }
}
