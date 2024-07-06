import java.util.Scanner;

public class SubstringOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Enter the string want to check:");
        String s1=sc.nextLine();
        int n=-1;
        for(int i=0;i<s.length()-s1.length();i++){
            if(s.substring(i,i+s1.length()).equals(s1)){
                n=i;
            }
        }
        System.out.println(n);
    }
}
