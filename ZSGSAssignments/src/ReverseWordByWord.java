import java.util.Scanner;

public class ReverseWordByWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse : ");
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        int last = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,last);
            last--;
        }
        String rev=String.join(" ",arr);

        System.out.println("Reversed sentence of given sentence is : "+rev);
    }

    private static void swap(String[] arr, int i, int last) {
        String temp = arr[i];
        arr[i]=arr[last];
        arr[last]=temp;
    }
}
