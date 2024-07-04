/*

Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

public int[] post4(int[] nums) {
    int len=nums.length-1;

    while(nums[len]!=4){
        len--;
    }

    int[] ans=new int[nums.length-len-1];

    int j=0;
    for(int i=len+1;i<nums.length;i++){
        ans[j++]=nums[i];
    }

    return ans;
}
