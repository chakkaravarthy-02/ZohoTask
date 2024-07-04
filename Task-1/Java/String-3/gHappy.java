/*

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */

public boolean gHappy(String str) {
    if(str.length()==0){
        return true;
    }
    if(str.length()<2){
        return false;
    }
    if(str.charAt(0)=='g'){
        if(str.charAt(1)!='g'){
            return false;
        }
    }
    for(int i=1;i<str.length()-1;i++){
        if(str.charAt(i)=='g'){
            if(str.charAt(i-1)!='g' && str.charAt(i+1)!='g'){
                return false;
            }
        }
    }
    if(str.charAt(str.length()-1)=='g'){
        if(str.charAt(str.length()-2)!='g'){
            return false;
        }
    }

    return true;
}