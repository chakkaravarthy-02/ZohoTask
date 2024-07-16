import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<n;i++){
            if(i%2==1){
                continue;
            }
            sum+=arr[i];
        }
        System.out.println("Sum of the even elements : "+sum);
    }
}
