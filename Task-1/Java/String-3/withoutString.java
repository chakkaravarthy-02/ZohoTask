/*

Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */

public String withoutString(String base, String remove) {
    if(base.length()==0)
        return "";
    String ans=base.toLowerCase();
    String rem=remove.toLowerCase();
    String res="";
    for(int i=0;i<ans.length();i++){
        if(i<=ans.length()-rem.length()){
            String check=ans.substring(i,i+rem.length());
            if(!check.equals(rem)){
                res+=base.substring(i,i+1);
            }else{
                i+=rem.length()-1;
            }
        }else{
            String check=ans.substring(i,i+1);
            if(!rem.equals(check)){
                res+=base.substring(i,i+1);
            }
        }
    }
    return res;
}
