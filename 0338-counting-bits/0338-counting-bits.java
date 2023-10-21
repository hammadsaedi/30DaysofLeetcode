class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        if(n >= 1) ans[1] = 1;
        int factor = 2;
        int i = 2;
        while(i < ans.length){
            while(i < ans.length && i < factor * 2){
                ans[i] = ans[i % factor] + 1;
                i++;
            }
            factor *= 2;      
        }
        return ans;
    }
}