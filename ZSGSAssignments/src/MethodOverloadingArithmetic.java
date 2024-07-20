
public class MethodOverloadingArithmetic {
    public static void main(String[] args){
        int a=6,b=5;
        float c=6.988f,d=5.9654f;
        double e=9.5,f=8.2;
        short g=55,h=66;
        byte i=8,j=99;
        long k=889,l=77;

        System.out.println("Integer Arithmetic operations");
        //Integers
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
        System.out.println("Float Arithmetic operations");
        //Float
        add(c,d);
        sub(c,d);
        mul(c,d);
        div(c,d);
        System.out.println("Double Arithmetic operations");
        //Double
        add(e,f);
        sub(e,f);
        mul(e,f);
        div(e,f);
        System.out.println("Short Arithmetic operations");
        //Short
        add(g,h);
        sub(g,h);
        mul(g,h);
        div(g,h);
        System.out.println("Byte Arithmetic operations");
        //Byte
        add(i,j);
        sub(i,j);
        mul(i,j);
        div(i,j);
        System.out.println("Long Arithmetic operations");
        //Long
        add(k,l);
        sub(k,l);
        mul(k,l);
        div(k,l);

    }

    //for float value
    private static void add(float e, float f) {
        System.out.println(e+f);
    }

    private static void sub(float e, float f) {
        System.out.println(e-f);
    }

    private static void mul(float e, float f) {
        System.out.println(e*f);
    }

    private static void div(float e, float f) {
        System.out.println(e/f);
    }

    //for double value
    private static void add(double e, double f) {
        System.out.println(e+f);
    }

    private static void sub(double e, double f) {
        System.out.println(e-f);
    }

    private static void mul(double e, double f) {
        System.out.println(e*f);
    }

    private static void div(double e, double f) {
        System.out.println(e/f);
    }

    //for long, int, short, byte
    private static void div(long a, long b) {
        System.out.println(a/b);
    }

    private static void mul(long a, long b) {
        System.out.println(a*b);
    }

    private static void sub(long a, long b) {
        System.out.println(a-b);
    }

    private static void add(long a, long b) {
        System.out.println(a+b);
    }
}
