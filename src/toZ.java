import java.util.Scanner;

public class toZ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Input get from the user
        System.out.println("Enter the character");
        char input = sc.next().charAt(0);
        //if user gives the lower case letter
        input =Character.toUpperCase(input);

        StringBuilder inputToZ= new StringBuilder();
        for(char i = input; i<='Z'; i++){
            inputToZ.append(i);
        }
        //print the answer
        System.out.println(inputToZ);
    }
}