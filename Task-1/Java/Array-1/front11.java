/*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */

public int[] front11(int[] a, int[] b) {
    if(a.length==0 && b.length==0){
        return a;
    }
    if(a.length==0){
        int[] ans=new int[1];
        ans[0]=b[0];
        return ans;
    }
    if(b.length==0){
        int[] ans=new int[1];
        ans[0]=a[0];
        return ans;
    }
    int[] ans =new int[2];
    ans[0]=a[0];
    ans[1]=b[0];

    return ans;
}
