import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        int[] array={2,9,0,2,0,50};

        //Array copied by creating new int[] and store it using for-loop
        System.out.println("Using for-loop : ");
        int[] copiedArray=new int[array.length];
        for(int i=0;i< array.length;i++){
            copiedArray[i]=array[i];
        }

        for(int i:array){
            System.out.print(i+" ");
        }

        System.out.println();
        //Array copied using Arrays.copyOf()
        System.out.println("copyOf() : ");
        int[] copyOf = Arrays.copyOf(array,array.length);
        for(int i:copyOf){
            System.out.print(i+" ");
        }

        System.out.println();
        //Array copied using Arrays.copyOfRange()
        System.out.println("copyOfRange() : ");
        int[] copyOfRange = Arrays.copyOfRange(array,0,array.length);
        for(int i: copyOfRange){
            System.out.print(i+" ");
        }
    }
}
