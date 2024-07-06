import java.util.Scanner;

public class CopyNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int num=sc.nextInt();
        int n=num/2;
        int count=1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
