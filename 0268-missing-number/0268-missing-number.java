class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        for(int i = 0; i < nums.length; i++){
            missing ^= nums[i] ^ (i + 1); 
        }
        return missing;
    }
}