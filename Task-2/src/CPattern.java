import java.util.Scanner;

public class CPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
