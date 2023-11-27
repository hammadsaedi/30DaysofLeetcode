class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int current = 1;
            for(int j = i; j < nums.length; j++){
                current *= nums[j]; 
                if(current > max){
                    max = current;
                }
            }
        }
        return max;
    }
}