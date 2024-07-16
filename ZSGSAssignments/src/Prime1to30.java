import java.util.Scanner;

public class Prime1to30 {
    public static void main(String[] args){
        int end=30;
        System.out.println("Prime numbers between 1 to 30");
        for(int i=2;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    private static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
