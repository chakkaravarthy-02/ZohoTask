/*

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

public String sameEnds(String string) {
    int mid=string.length()/2;
    int midL=mid;

    if(string.length()%2==0){
        while(midL>=0 && mid<string.length()){
            if(string.substring(0,midL).equals(string.substring(mid))){
                return string.substring(0,midL);
            }else{
                midL--;
                mid++;
            }
        }
    }
    while(midL>=0 && mid<string.length()){
        if(string.substring(0,midL).equals(string.substring(mid+1))){
            return string.substring(0,midL);
        }else{
            midL--;
            mid++;
        }
    }
    return "";
}