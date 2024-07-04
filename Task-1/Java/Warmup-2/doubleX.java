/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

boolean doubleX(String str) {

    for(int i=0;i<str.length()-1;i++){
        char c=str.charAt(i);
        if(str.charAt(i)=='x'){
            if(c==str.charAt(i+1)){
                return true;
            }else{
                break;
            }
        }
    }
    return false;
}
