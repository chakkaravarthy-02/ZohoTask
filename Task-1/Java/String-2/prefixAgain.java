/*

Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */

public boolean prefixAgain(String str, int n) {
    if(str.length()<2){
        return false;
    }
    if(str.length()==2){
        return str.charAt(0)==str.charAt(1);
    }
    String s=str.substring(0,n);

    for(int i=n+1;i<str.length()-s.length()+1;i++){
        if(s.equals(str.substring(i,i+s.length()))){
            return true;
        }
    }
    return false;
}
