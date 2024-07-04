/*

Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */

public boolean equalIsNot(String str) {
    String is="is";
    String not="not";
    int isCount=0;
    int notCount=0;

    for(int i=0;i<str.length()-is.length()+1;i++){
        if(is.equals(str.substring(i,i+is.length()))){
            isCount++;
        }
    }
    for(int i=0;i<str.length()-not.length()+1;i++){
        if(not.equals(str.substring(i,i+not.length()))){
            notCount++;
        }
    }
    return isCount==notCount;
}
