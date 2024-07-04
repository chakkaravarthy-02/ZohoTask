/*

Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

public boolean startHi(String str) {
    if(str.length()<2){
        return false;
    }
    String hi="hi";
    String check=str.substring(0,2);

    if(hi.equals(check)){
        return true;
    }
    return false;
}