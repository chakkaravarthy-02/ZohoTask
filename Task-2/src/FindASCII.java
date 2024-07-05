import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char input = sc.next().charAt(0);

        //by changing char into int makes the character into its corresponding ascii value
        System.out.println((int) input);
    }
}
