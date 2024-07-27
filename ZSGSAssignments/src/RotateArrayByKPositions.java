import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKPositions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int n=scanner.nextInt();

        int[] array=new int[n];
        System.out.println("Enter the array elements one by one : ");
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter the position to rotate : ");
        int position=scanner.nextInt();

        position%=n;

        int[] rotated=new int[n];
        int index=0;
        int arrayIndex=n-position;
        for (int i=arrayIndex;i<n;i++){
            rotated[index++]=array[i];
        }
        for(int i=0;i<arrayIndex;i++){
            rotated[index++]=array[i];
        }


        System.out.println("Given Array : "+Arrays.toString(array));
        System.out.println("Rotated array by "+position+" position is : "+ Arrays.toString(rotated));
    }
}
