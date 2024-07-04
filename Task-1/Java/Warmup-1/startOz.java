/*

Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

public String startOz(String str) {
    String ans="";

    if(str.length()==0){
        return str;
    }

    if(str.charAt(0)=='o'){
        ans+="o";
    }
    if(str.length()>1){
        if(str.charAt(1)=='z'){
            ans+="z";
        }
    }

    return ans;
}