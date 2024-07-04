/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */

public String delDel(String str) {
    if(str.length()<4){
        return str;
    }
    if(str.length()<5){
        String del="del";
        String check=str.substring(1,4);
        if(del.equals(check)){
            return String.valueOf(str.charAt(0));
        }
        return str;
    }
    String del="del";
    String check=str.substring(1,4);

    if(del.equals(check)){
        return str.charAt(0)+str.substring(4);
    }
    return str;
}
