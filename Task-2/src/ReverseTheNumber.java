import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        //getting input from user
        int num=sc.nextInt();
        System.out.println("Original number : "+num);
        int reversedNum=0;
        //rem get the remainder which is unit digit and num/=10 makes that unit digit remove
        //from num and add it to the reversedNumber.
        while(num>0){
            int rem=num%10;
            num/=10;
            reversedNum=reversedNum*10+rem;
        }
        System.out.println("Reversed number "+reversedNum);
    }
}
