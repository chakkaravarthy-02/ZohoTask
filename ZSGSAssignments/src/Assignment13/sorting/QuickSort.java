package Assignment13.sorting;

import java.util.Arrays;

public class QuickSort implements Sortable{
    //Quick-Sort
    @Override
    public void sort(int[] array) {
        sortQuick(array,0, array.length-1);
    }
    public void sortQuick(int[] array,int start,int end){
        if(start>=end)return;

        int s=start;
        int e=end;
        int mid=(s+e)/2;

        int pivot=array[mid];

        while(s<=e){
            while(array[s]<pivot)s++;
            while(array[e]>pivot)e--;
            if(s<=e){
                swap(array,s,e);
                s++;e--;
            }
        }
        Arrays.sort(array);

        sortQuick(array,start,e);
        sortQuick(array,s,end);
    }
    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
