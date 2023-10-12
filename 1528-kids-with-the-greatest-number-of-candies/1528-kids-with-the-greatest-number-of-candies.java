class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> flags = new LinkedList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max) max = candies[i];
        }   
        for(int i = 0; i < candies.length; i++){
            int sum = candies[i] + extraCandies;
            if(sum >= max){
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        return flags;
    }
}