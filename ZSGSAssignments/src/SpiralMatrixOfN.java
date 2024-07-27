import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrixOfN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n=scanner.nextInt();
        int value=1;
        int[][] array=new int[n][n];

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;

        while(left<=right && top<=bottom) {
            for (int i = left; i <=right; i++) {
                array[top][i]=value++;
            }
            top++;
            for (int i=top;i<=bottom;i++){
                array[i][right]=value++;
            }
            right--;
            for(int i=right;i>=left;i--){
                array[bottom][i]=value++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--) {
                array[i][left] = value++;
            }
            left++;
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
