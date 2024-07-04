/*

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */

public boolean lastDigit(int a, int b) {
    int aRem=a%10;
    int bRem=b%10;

    return aRem==bRem;
}