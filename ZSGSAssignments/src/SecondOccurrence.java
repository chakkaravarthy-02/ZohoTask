import java.util.Scanner;

public class SecondOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found");
        int found=sc.nextInt();

        int count=0;
        for(int i=0;i<n;i++){
            if(count>1){
                System.out.println("Element found at:"+i);
                System.exit(0);
            }
            if(found==arr[i]){
                count++;
            }
        }
        System.out.println("Element 2 occurrence not found");
    }
}
