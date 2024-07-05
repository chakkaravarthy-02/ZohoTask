/*
a+=a++ + ++a + --a + a--;when a=28

answer:144 correct
 */

public class PaperAndProgram2 {
    public static void main(String[] args){
        int a=28;
        a+=a++ + ++a + --a + a--;
        System.out.println(a);
    }
}
