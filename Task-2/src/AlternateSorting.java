import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the array one by one");
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);

        int[] result=new int[array.length];
        int i=0;
        int j= array.length-1;
        int index=0;
        while(i<j){
            result[index++]=array[j];
            result[index++]=array[i];
            j--;
            i++;
        }
        if(n%2!=0){
            result[index]=array[i];
        }

        for(int res:result){
            System.out.print(res+" ");
        }
    }
}
