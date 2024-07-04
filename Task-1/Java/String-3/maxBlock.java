/*

Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

public int maxBlock(String str) {
    if(str.length()==0)
        return 0;
    int largest=Integer.MIN_VALUE;

    for(int i=0;i<str.length();i++){
        int count=0;
        for(int j=i;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }else{
                break;
            }
        }
        largest=Math.max(count,largest);
    }
    return largest;
}