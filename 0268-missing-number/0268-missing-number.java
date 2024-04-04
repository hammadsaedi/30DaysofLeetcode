class Solution {
    public int missingNumber(int[] nums) {
        int flag = nums.length;
        for(int i = 0; i < nums.length; i++){
            flag ^= i;
            flag ^= nums[i];
        }
        return flag;
    }
}