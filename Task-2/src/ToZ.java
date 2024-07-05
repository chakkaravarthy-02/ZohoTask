import java.util.Scanner;

public class ToZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");

        //Getting input from user
        char c=sc.next().charAt(0);

        //if user gives lowerCase letter change into upperCase
        c=Character.toUpperCase(c);

        int end='Z';

        //using for loop to increment the ascii value
        for(int i=c;i<=end;i++){
            System.out.print((char)i);
        }
    }
}