class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> flags = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max) max = candies[i];
        }   
        for(int i = 0; i < candies.length; i++){
            flags.add(candies[i] + extraCandies >= max);
        }
        return flags;
    }
}