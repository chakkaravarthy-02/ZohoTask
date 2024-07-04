/*

Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

public boolean evenlySpaced(int a, int b, int c) {
    int[] arr=new int[3];

    arr[0]=a;
    arr[1]=b;
    arr[2]=c;

    Arrays.sort(arr);
    if((arr[0] - arr[1]) == (arr[1] - arr[2])){
        return true;
    }
    return false;
}
