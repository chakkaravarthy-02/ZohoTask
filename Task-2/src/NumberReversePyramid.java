import java.util.Scanner;

public class NumberReversePyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();

        int count=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(count+" ");
            }
            count--;
            System.out.println();
        }
    }
}
