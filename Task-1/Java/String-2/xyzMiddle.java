/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public boolean xyzMiddle(String str) {
    if(str.length()<3){
        return false;
    }
    int mid=str.length()/2;
    if(str.length()%2==0){
        if("xyz".equals(str.substring(mid-1,mid+2)) || "xyz".equals(str.substring(mid-2,mid+1))){
            return true;
        }
    }
    return "xyz".equals(str.substring(mid-1,mid+2));
}
