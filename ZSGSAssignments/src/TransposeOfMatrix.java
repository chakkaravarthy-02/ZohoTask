import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("To find the transpose of the matrix ");
        System.out.println("Enter the row length : ");
        int m=scanner.nextInt();
        System.out.println("Enter the column length : ");
        int n=scanner.nextInt();

        int[][] array=new int[m][n];
        System.out.println("Enter the array elements one by one : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Given matrix is:" );
        for(int i=0;i<m;i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int[][] transposedArray=new int[n][m];
        for(int i=0;i<m;i++){
            for (int j =0; j < n; j++) {
                transposedArray[j][i]=array[i][j];
            }
        }
        System.out.println("Transposed of given matrix is:");
        for(int i=0;i<n;i++) {
            System.out.println(Arrays.toString(transposedArray[i]));
        }
    }
}
