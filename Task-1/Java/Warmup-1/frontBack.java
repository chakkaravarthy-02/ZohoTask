/*

Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

 */

public String frontBack(String str) {

    if(str.length()==0){
        return str;
    }
    char[] c=str.toCharArray();
    String ans="";

    char temp=c[0];
    c[0]=c[c.length-1];
    c[c.length-1]=temp;

    for(char c1:c){
        ans+=c1;
    }
    return ans;
}