import java.util.Scanner;

public class SumToN {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the term");
        int n= scanner.nextInt();

        int sum=1;
        int ans=0;
        StringBuilder s= new StringBuilder();
        for(int i=0;i<n;i++) {
            ans += sum;
            s.append(sum).append("+");
            sum = (sum * 10) + 1;
        }
        s.deleteCharAt(s.length()-1);
        System.out.println(s);
        System.out.println(ans);
    }
}
