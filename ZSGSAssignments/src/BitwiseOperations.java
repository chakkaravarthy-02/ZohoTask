import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform bitwise operations");
        int a=sc.nextInt();
        int b= sc.nextInt();

        //AND-Operation (&)
        int bitwiseAnd=a&b;
        System.out.println("Bitwise And for a & b : "+bitwiseAnd);

        //OR-Operation (&)
        int bitwiseOr=a|b;
        System.out.println("Bitwise Or for a | b : "+bitwiseOr);

        //XOR-Operation (&)
        int bitwiseXor=a^b;
        System.out.println("Bitwise Xor for a ^ b : "+bitwiseXor);

        //RightShift-Operation
        int bitwiseRightSwift=a>>b;
        System.out.println("Bitwise RightSwift for a >> b : "+bitwiseRightSwift);

        //LeftShift-Operation
        int bitwiseLeftSwift=a<<b;
        System.out.println("Bitwise RightSwift for a << b : "+bitwiseLeftSwift);

        //RightShift-Operation
        int unSignedBitwiseRightSwift=a>>>b;
        System.out.println("Bitwise RightSwift for a xor b : "+unSignedBitwiseRightSwift);
    }
}
