import java.util.Scanner;

public class ReverseLetterbyLetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse : ");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int last = s.length()-1;
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,last);
            last--;
        }
        System.out.println("Reversed String of given String is : "+String.valueOf(arr));
    }

    private static void swap(char[] arr, int i, int last) {
        char temp = arr[i];
        arr[i]=arr[last];
        arr[last]=temp;
    }
}
