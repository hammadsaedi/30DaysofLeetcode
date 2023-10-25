class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        return search(nums, target, 0, nums.length - 1, list);
    
    }

    private List<Integer> search(int[] nums, int target, int start, int end, List<Integer> list){
        if(start > end){
            return list;
        }
        int mid = (start + end) / 2;
        if(mid - 1 >= 0 && nums[mid - 1] >= target){
            search(nums, target, start, mid - 1, list);
        }
        if(nums[mid] == target){
            list.add(mid);
        }
        if(mid + 1 < nums.length && nums[mid + 1] <= target){
            search(nums, target, mid + 1, end, list);
        }
        return list;
    }
}