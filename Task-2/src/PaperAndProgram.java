/*
i)++a-b– ii)a%b++ iii)a*=b+5 iv)x=69>>>2

On paper:
if a=5,b=6

i)0 correct
ii)1 correct
iii)41 wrong
iv)17 correct
 */

public class PaperAndProgram {
    public static void main(String[] args){
        int a=5,b=6;
        System.out.println("++a-b++ : "+(++a-b--));
        System.out.println("a%b++ : "+(a%b++));
        a*=b+5;
        System.out.println("a*=b+5 : "+(a));
        System.out.println("69>>2 : "+(69>>>2));
    }
}

