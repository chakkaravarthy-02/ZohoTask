public class MathOperationInStaticBlock {
    static int a;
    static int b;
    static {
        a=10;
        b=6;
    }
    public static void main(String[] args){
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
    }
}
