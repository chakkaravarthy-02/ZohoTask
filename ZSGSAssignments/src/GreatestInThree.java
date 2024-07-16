import java.util.Scanner;

public class GreatestInThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int answer=a;
        if(b>a && b>c){
            answer=b;
        }else if(c>a && c>b){
            answer=c;
        }
        System.out.println(answer);
    }
}
