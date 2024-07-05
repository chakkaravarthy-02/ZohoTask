import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();

        //getting array from user
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        //declaring the variable into maximum integer value
        int smallest=Integer.MAX_VALUE;

        //traverse to find the smallest value
        for(int i=0;i<n;i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }

        System.out.println("Smallest element is : "+smallest);
    }
}
