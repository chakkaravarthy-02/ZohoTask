/*

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */

public String seeColor(String str) {
    String red="red";
    String blue="blue";

    if(str.length()<3){
        return "";
    }
    if(str.length()>3){
        if(str.substring(0,4).equals(blue)){
            return blue;
        }
    }
    if(str.substring(0,3).equals(red)){
        return red;
    }
    return "";
}