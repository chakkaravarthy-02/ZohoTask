package Assignment13.sorting;

public class BubbleSort implements Sortable{
    //Bubble-Sort
    @Override
    public void sort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    swap(array,i,j);
                }
            }
        }
    }
    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
