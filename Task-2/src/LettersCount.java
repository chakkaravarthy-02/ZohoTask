import java.util.Scanner;

import static java.lang.Character.isDigit;

public class LettersCount {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //getting input from user
        String input=sc.nextLine();

        StringBuilder ans= new StringBuilder();

        //for loop to traverse entire string
        for(int i=0;i<input.length()-1;i+=2){
            int count=0;
            char c=input.charAt(i);
            //checks the nearest char is digit
            if(isDigit(input.charAt(i+1))){
                count = Integer.parseInt(input.charAt(i + 1)+"");
                //checks the number is two digit or not
                if(isDigit(input.charAt(i+2))){
                    count=count*10+Integer.parseInt(input.charAt(i+2)+"");
                    i++;
                }
            }
            //loop to print the char in its specific count.
            for(int j=0;j<count;j++){
                ans.append(c);
            }
        }
        System.out.println(ans);

    }
}
