public class BitwiseOperator {
    public static void main(String[] args){
        int a=4;
        int b=8;

        //0101 & 0111 = 0101
        System.out.println("a & b = "+ (a&b));
        //0101 | 0111 = 0111
        System.out.println("a | b = "+ (a|b));
        //0101 ^ 0111 = 0011
        System.out.println("a ^ b = "+ (a^b));
        //~0101 = 1010 (~0110(6) + 1 = 1001+1 = 1010(-6))
        System.out.println("~a = "+ (~a));
        //0101 >> 2 = 0001
        System.out.println("a>>2 = "+(a>>2));
        //0111 << 2 = 11100
        System.out.println("b<<2 = "+(b<<2));
        //0111 >>> 2 = 0001
        System.out.println("b>>>2 = "+(b>>>2));
    }
}
