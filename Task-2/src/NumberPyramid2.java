import java.util.Scanner;

public class NumberPyramid2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1-n;j<=n-1;j++){
                int abs=Math.abs(j);
                if(abs<i)
                    System.out.print(i-abs);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
