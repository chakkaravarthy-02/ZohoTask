/*

Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */

public int[] makeMiddle(int[] nums) {
    int[] ans=new int[2];

    int mid=nums.length/2;
    ans[0]=nums[mid-1];
    ans[1]=nums[mid];

    return ans;
}
