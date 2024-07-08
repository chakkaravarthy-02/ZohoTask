/*

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */

public Map<String, String> firstChar(String[] strings) {
    Map<String, String>map=new HashMap<>();
    for(int i=0;i<strings.length;i++){
        if(map.containsKey(strings[i].charAt(0)+"")){
            map.put(strings[i].charAt(0)+"",map.get(strings[i].charAt(0)+"")+strings[i]);
        }else{
            map.put(strings[i].charAt(0)+"",strings[i]);
        }
    }
    return map;
}