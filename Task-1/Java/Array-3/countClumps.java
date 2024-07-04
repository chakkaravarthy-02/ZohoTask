/*

Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */

public int countClumps(int[] nums) {
    int size=0;
    for(int i=0;i<nums.length;){
        int num=nums[i];
        i++;
        int count=0;
        while(i<nums.length && nums[i]==num){
            count++;
            i++;
        }
        if(count>0){
            size++;
        }
    }
    return size;
}