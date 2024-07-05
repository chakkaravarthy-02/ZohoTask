import java.util.Scanner;

public class StarUnderscorePattern {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++){
                System.out.print("_");
            }
            for(int j=i;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=2*(n-i);j>0;j--){
                System.out.print("_");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
