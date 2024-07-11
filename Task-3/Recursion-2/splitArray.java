/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
 */

public boolean splitArray(int[] nums) {
    return splitArrayHelper(0,nums,0,0);
}
public boolean splitArrayHelper(int start,int[] nums,int lsum,int rsum){
    if(start>=nums.length){
        return lsum==rsum;
    }
    return splitArrayHelper(start+1,nums,lsum+nums[start],rsum) || splitArrayHelper(start+1,nums,lsum,rsum+nums[start]);
}
