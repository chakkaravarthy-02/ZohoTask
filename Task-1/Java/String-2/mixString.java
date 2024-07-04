/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public String mixString(String a, String b) {
    String ans="";
    if(a.length()<b.length()){
        int i=0;
        while(i<a.length()){
            ans+=a.charAt(i);
            ans+=b.charAt(i);
            i++;
        }
        while(i<b.length()){
            ans+=b.charAt(i);
            i++;
        }
        return ans;
    }
    int i=0;
    while(i<b.length()){
        ans+=a.charAt(i);
        ans+=b.charAt(i);
        i++;
    }
    while(i<a.length()){
        ans+=a.charAt(i);
        i++;
    }
    return ans;
}