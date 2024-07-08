/*

Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.


commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
 */

public int commonTwo(String[] a, String[] b) {
    int count=0;
    int i=0;
    int j=0;
    String s="";
    while(i<a.length && j<b.length){
        if(a[i].compareTo(b[j])==0 && !s.equals(a[i])){
            s=a[i];
            count++;
            i++;
            j++;
        }
        else if(a[i].compareTo(b[j])==0 && s.equals(a[i])){
            i++;
            j++;
        }
        else if(a[i].compareTo(b[j])<0){
            i++;
        }else{
            j++;
        }
    }
    return count;
}