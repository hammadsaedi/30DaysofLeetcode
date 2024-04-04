class Solution {
    public int hammingDistance(int x, int y) {
        return hammingWeight(x ^ y);
    }
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            count += (n & 1);
            n = n >>> 1;   
        }
        return count;
    }
}