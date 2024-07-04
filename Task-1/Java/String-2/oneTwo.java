/*

Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

public String oneTwo(String str) {
    if(str.length()<3){
        return "";
    }
    //int rem=str.length()%3;
    char[] str1=str.toCharArray();
    int i;
    for(i=0;i<str1.length-2;i+=3){
        char temp=str1[i];
        str1[i]=str1[i+1];
        str1[i+1]=str1[i+2];
        str1[i+2]=temp;
    }
    String ans= new String(str1);

    return ans.substring(0,i);
}
