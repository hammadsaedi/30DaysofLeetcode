class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0, right = 1;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int current = prices[right] - prices[left];
                if(current > max){
                    max = current;
                } 
            } else {
                left = right;
            }
            right++;
        }
        return max;
    }
}