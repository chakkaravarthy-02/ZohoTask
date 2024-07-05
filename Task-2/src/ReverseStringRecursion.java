import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //user input
        String s=sc.nextLine();

        //print the original string
        System.out.println(s);

        //splitting the string and store it on array
        String[] s1=s.split(" ");

        //calling the function
        reverseArray(s1);

        //print the reversed string
        StringBuilder ans= new StringBuilder();
        for(String s2:s1){
            ans.append(s2).append(" ");
        }

        //which removes the unwanted spaces at the end
        System.out.println(ans.toString().trim());
    }
    public static void reverseArray(String[] s1){

        //calling function which swaps the elements in array.
        reverse(s1,0,s1.length-1);
    }
    public static void reverse(String[] s1,int start ,int end){

        //it ends when start greater than end
        if(start<end){
            String temp=s1[start];
            s1[start]=s1[end];
            s1[end]=temp;
            //Recursive call
            reverse(s1,++start,--end);
        }
    }
}
