/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true
 */

public boolean split53(int[] nums) {
    return splitArrayHelper1(0,nums,0,0);
}
public boolean splitArrayHelper1(int start,int[] nums,int lsum,int rsum){
    if(start>=nums.length){
        return lsum==rsum;
    }
    if(nums[start]%5==0){
        return splitArrayHelper1(start+1,nums,lsum+nums[start],rsum);
    }else if(nums[start]%3==0){
        return splitArrayHelper1(start+1,nums,lsum,rsum+nums[start]);
    }
    return splitArrayHelper1(start+1,nums,lsum+nums[start],rsum) || splitArrayHelper1(start+1,nums,lsum,rsum+nums[start]);
}