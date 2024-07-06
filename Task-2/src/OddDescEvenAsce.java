import java.util.Scanner;

public class OddDescEvenAsce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the array one by one");
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i=1;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
