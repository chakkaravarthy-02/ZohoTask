import java.util.Scanner;

public class DiagonalStringPattern {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word:");
        String s=scanner.nextLine();
        int n=s.length();

        int a=0,b=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && i!=n/2){
                    System.out.print(s.charAt(a));
                }else if(i+j==n-1){
                    System.out.print(s.charAt(b));
                }
                else{
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            System.out.println();
        }
    }
}
