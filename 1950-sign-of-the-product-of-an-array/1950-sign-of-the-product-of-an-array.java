class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for(int i : nums){
            if (i == 0) return 0;
            count += (i > 0)?0:1;
        }
        System.gc();
        return ((count & 1) == 0)?1:-1; 
    }
}