class Solution {
    public void moveZeroes(int[] nums) {
        int pointer  = 0;
        int i = 0;
        while(i < nums.length){
           if(nums[i] != 0){
               nums[pointer++] = nums[i];
           }
           i++;
        }
        while(pointer < nums.length){
           nums[pointer++] = 0;
        }
    }
}