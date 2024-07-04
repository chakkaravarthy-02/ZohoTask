/*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public String repeatSeparator(String word, String sep, int count) {
    String ans="";

    for(int i=0;i<count-1;i++){
        ans+=word;
        ans+=sep;
    }
    if(count==0){
        return ans;
    }
    return ans+word;
}
