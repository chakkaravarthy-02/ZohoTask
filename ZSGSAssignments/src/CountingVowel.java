import java.util.Scanner;

public class CountingVowel {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        System.out.println("Vowels in the string is : "+count);
    }

    private static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
