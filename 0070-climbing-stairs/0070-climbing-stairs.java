class Solution {
    static double sqrt5 = Math.sqrt(5);
    static double phi = (1 + sqrt5) / 2;
    public int climbStairs(int n) {
        return (int) Math.round((Math.pow(phi, n + 1) - Math.pow(1 - phi, n + 1)) / sqrt5);
    }
}