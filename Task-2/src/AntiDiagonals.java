import java.util.Scanner;

public class AntiDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        int[][] array=new int[n][n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int[][] result=new int[2*n-1][];

        for(int i=0;i<2*n-1;i++){
            int s=i<n?i+1:2*n-1-i;
            int[] temp=new int[s];
            int row;
            int col;
            if (i < n) {
                row = 0;
                col = i;
            } else {
                row = i - n + 1;
                col = n - 1;
            }
            int index=0;
            while(row<n && col>=0){
                temp[index]=array[row][col];
                row++;
                col--;
                index++;
            }
            result[i]=temp;
        }

        for(int[] i:result){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
