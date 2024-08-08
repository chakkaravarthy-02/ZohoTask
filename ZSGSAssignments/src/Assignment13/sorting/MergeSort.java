package Assignment13.sorting;

public class MergeSort implements Sortable{
    //Merge-Sort
    @Override
    public void sort(int[] array) {
        sortMerge(array,0,array.length-1);
    }
    public void sortMerge(int[] array,int start,int end){
        if(start==end)return;

        int mid=(start+end)/2;

        //divide
        sortMerge(array,start,mid);
        sortMerge(array,mid+1,end);

        //merge
        merge(array,start,mid,end);
    }
    public void merge(int[] array,int start,int mid,int end){
        int[] first=new int[mid-start+1];
        int[] second=new int[end-mid];

        for(int i=0;i<first.length;i++){
            first[i]=array[start+i];
        }
        for(int i=0;i<second.length;i++){
            second[i]=array[mid+i+1];
        }

        int i=0,j=0,index=start;

        while(i<first.length && j< second.length){
            if(first[i]<=second[j]){
                array[index++]=first[i++];
            }else{
                array[index++]= second[j++];
            }
        }
        while(i<first.length){
            array[index++]=first[i++];
        }
        while(j<second.length){
            array[index++]=second[j++];
        }
    }
}
