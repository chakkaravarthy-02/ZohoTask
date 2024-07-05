import java.util.Scanner;

import static java.lang.Character.isLetter;

public class IsAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check");
        char input = sc.next().charAt(0);

        if(isLetter(input)){
            System.out.println("Given character '"+input +"' is an Alphabet");
        }else{
            System.out.println("Given character '"+input +"' is not an Alphabet");
        }
    }
}
