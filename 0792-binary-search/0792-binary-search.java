class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public int search(int[] nums, int target, int start, int end) {
        if(end - start < 0)
            return -1;
        int mid = (start + start) / 2;
        if(nums[mid] == target)
            return mid;
        if(nums[mid] > target)
            return search(nums, target, start, mid - 1);
        return search(nums, target, mid + 1, end);        
    }
}