/*

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public int stringMatch(String a, String b) {
    int i=0,j=0;
    int count=0;
    while(i<a.length()-1 && j<b.length()-1){
        String a1=a.charAt(i)+""+a.charAt(i+1);
        String b1=b.charAt(j)+""+b.charAt(j+1);
        if(a1.equals(b1)){
            count++;
        }
        i++;
        j++;
    }
    return count;
}