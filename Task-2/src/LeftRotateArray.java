public class LeftRotateArray {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row=0;
        int m=4;
        int col=0;
        int n=4;

        while(row<m && col<n){
            for(int i=col;i<n-1;i++){
                int temp=arr[row][i];
                arr[row][i]=arr[row][i+1];
                arr[row][i+1]=temp;
            }
            row++;
            for(int i=row-1;i<m-1;i++){
                int temp=arr[i][n-1];
                arr[i][n-1]=arr[i+1][n-1];
                arr[i+1][n-1]=temp;
            }
            n--;

            if(row<m){
                for(int i=n;i>col;i--){
                    int temp=arr[m-1][i];
                    arr[m-1][i]=arr[m-1][i-1];
                    arr[m-1][i-1]=temp;
                }
            }
            m--;
            if(col<n){
                for(int i=m;i>row;i--){
                    int temp=arr[i][col];
                    arr[i][col]=arr[i-1][col];
                    arr[i-1][col]=temp;
                }
            }
            col++;
        }

        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
