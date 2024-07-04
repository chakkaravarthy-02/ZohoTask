/*

Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

public String starOut(String str) {
    if(str.length()==0)
        return "";
    if(str.length()==1){
        if(str.charAt(0)!='*'){
            return str;
        }
        return "";
    }
    String ans="";
    if(str.charAt(0)!='*' && str.charAt(1)!='*'){
        ans=str.charAt(0)+ans;
    }
    for(int i=1;i<str.length()-1;i++){
        if(str.charAt(i+1)=='*'|| str.charAt(i)=='*' || str.charAt(i-1)=='*'){
            continue;
        }
        ans=ans+str.charAt(i);
    }
    if(str.charAt(str.length()-2)!='*' && str.charAt(str.length()-1)!='*'){
        ans+=str.charAt(str.length()-1);
    }
    return ans;

}