/*

Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */

public boolean xyzThere(String str) {
    if(str.length()<3)
        return false;

    if("xyz".equals(str.charAt(0)+""+str.charAt(1)+""+str.charAt(2))){
        return true;
    }
    for(int i=0;i<str.length()-3;i++){
        if(str.charAt(i)!='.' && str.charAt(i+1)=='x' && str.charAt(i+2)=='y' && str.charAt(i+3)=='z'){
            return true;
        }
    }
    return false;
}
