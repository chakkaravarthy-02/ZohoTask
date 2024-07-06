import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1-n;j<=n-1;j++){
                int abs=Math.abs(j);
                if(abs<i)
                    System.out.print(n-abs);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
-9-8-7-6-5-4-3-2-1 0 1 2 3 4 5 6 7 8 9
                   1
                   2
                   3
                   4
                   5
                   6
                   7
                   8
                   9
 */
