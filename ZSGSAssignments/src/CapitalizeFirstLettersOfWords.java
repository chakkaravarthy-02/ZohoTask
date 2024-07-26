import java.util.Scanner;

public class CapitalizeFirstLettersOfWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to alter : ");
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
        }
        String rev=String.join(" ",arr);

        System.out.println("Altered sentence of given sentence is : "+rev);
    }
}
