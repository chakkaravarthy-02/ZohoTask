/*

Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */

public int[] squareUp(int n) {
    int[] ans=new int[n*n];

    if(n==0)
        return ans;
    for(int i=n-1;i<ans.length;i+=n){
        int count=1;
        for(int j=i;j>=i-i/n;j--){
            ans[j]=count;
            count++;
        }
    }
    return ans;
}
