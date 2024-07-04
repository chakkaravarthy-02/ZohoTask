/*

Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */

public boolean lastDigit(int a, int b, int c) {
    int amod=a%10;
    int bmod=b%10;
    int cmod=c%10;
    int count=1;

    if(amod==bmod){
        count++;
    }
    if(cmod==amod){
        count++;
    }
    if(bmod==cmod){
        count++;
    }
    return count>=2;
}
