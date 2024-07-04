/*

Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */

public boolean canBalance(int[] nums) {
    int[] leftsum=new int[nums.length];
    int[] rightsum=new int[nums.length];

    leftsum[0]=nums[0];
    rightsum[rightsum.length-1]=0;

    for(int i=1;i<leftsum.length;i++){
        leftsum[i]=leftsum[i-1]+nums[i];
    }
    for(int i=rightsum.length-2;i>=0;i--){
        rightsum[i]=rightsum[i+1]+nums[i+1];
    }

    for(int i=0;i<nums.length;i++){
        if(leftsum[i]==rightsum[i]){
            return true;
        }
    }
    return false;
}
