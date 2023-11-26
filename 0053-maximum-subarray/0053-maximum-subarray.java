class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0, right = 0;
        int max = nums[0];
        int prefix = 0;
        while(right < nums.length){
            if(prefix < 0)
                prefix = 0;
            prefix += nums[right];
            max = Math.max(max, prefix);
            right++;
        }
        return max;
    }
}