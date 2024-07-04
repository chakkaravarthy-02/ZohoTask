/*

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */

public String getSandwich(String str) {
    int start=-1;
    int end=-1;
    for(int i=0;i<str.length()-5;i++){
        if(str.substring(i,i+5).equals("bread")){
            start=i;
            break;
        }
    }
    for(int i=str.length()-5;i>=0;i--){
        if(str.substring(i,i+5).equals("bread")){
            end=i;
            break;
        }
    }

    if(start!=-1 && end!=-1 && start!=end)return str.substring(start+5,end);
    return "";
}