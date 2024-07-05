import java.util.Scanner;

public class PrintDuplicateElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();

        int[] array=new int[n];

        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }

        //print Duplicate Elements
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
