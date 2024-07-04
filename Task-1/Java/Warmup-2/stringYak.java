/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */

public String stringYak(String str) {
    if(str.length()<4)
        if(str.equals("yak"))
            return "";
        else return str;
    StringBuilder sb=new StringBuilder(str);
    String ans="";
    for(int i=0;i<str.length()-2;i++){
        ans=str.replace("yak","");
    }
    return ans;
}