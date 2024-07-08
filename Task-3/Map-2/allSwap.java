/*

We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */

public String[] allSwap(String[] strings) {
    String[] ans=new String[strings.length];
    Map<Character, Integer>map=new HashMap<>();
    for(int i=0;i<strings.length;i++){
        char c=strings[i].charAt(0);
        if(map.containsKey(c)){
            int n=map.get(c);
            map.remove(c);
            ans[i]=ans[n];
            ans[n]=strings[i];
        }else{
            ans[i]=strings[i];
            map.put(c,i);
        }
    }
    return ans;
}