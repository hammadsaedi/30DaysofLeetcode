class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            list = new ArrayList<>();
            list.add(1);
            list.add(1);
            return list.get(n);
        }
        climbStairs(n - 1);
        list.add(list.get(n - 1) + list.get(n - 2));
        return list.get(n);
    }
}