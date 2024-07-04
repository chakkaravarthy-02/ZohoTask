/*

Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public String wordEnds(String str, String word) {
    if(str.length()<3){
        return "";
    }
    String ans="";
    if(word.equals(str.substring(0,0+word.length()))){
        ans+=str.charAt(0+word.length());
    }
    for(int i=1;i<str.length()-word.length();i++){
        if(word.equals(str.substring(i,i+word.length()))){
            ans+=str.charAt(i-1)+""+str.charAt(i+word.length());
        }
    }
    if(word.equals(str.substring(str.length()-word.length(),str.length()))){
        ans+=str.charAt(str.length()-word.length()-1);
    }
    return ans;
}
