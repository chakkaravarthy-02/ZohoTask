package Assignment13.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithmMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BubbleSort bubbleSort=new BubbleSort();
        MergeSort mergeSort=new MergeSort();
        QuickSort quickSort=new QuickSort();

        System.out.println("Enter the array size : ");
        int n= scanner.nextInt();

        System.out.println("Enter the array element one by one");
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("choose the id of algorithm you want : ");
        System.out.println("1.BubbleSort");
        System.out.println("2.MergeSort");
        System.out.println("3.QuickSort");
        int id=scanner.nextInt();

        if(id==1){
            bubbleSort.sort(array);
        }
        if(id==2){
            mergeSort.sort(array);
        }
        if(id==3){
            quickSort.sort(array);
        }

        System.out.println("Sorted Array : "+ Arrays.toString(array));
    }
}
