class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        int position = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                position = i;
            }
            else
                product *= nums[i];
        }
        int[] answer = new int[nums.length];
        if(count == 1){
            answer[position] = product;
        }
        if(count >= 1)
            return answer;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) 
                continue;
            nums[i] = product / nums[i];
        }
        return nums;
    }
}