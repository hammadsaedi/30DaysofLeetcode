class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean isSelfDividing(int n){
        int x = n;
        while(x != 0){
            int y = (x % 10);
            if (y == 0 || (n % y != 0 ))
                return false;
            x /= 10;
        }
        return true;
    }
}