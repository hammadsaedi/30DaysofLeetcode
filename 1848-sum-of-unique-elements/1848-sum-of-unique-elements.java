class Solution {
    public int sumOfUnique(int[] nums) {
        int[] frequency = new int[101];
        for(int i : nums)
            frequency[i]++;
        int sum = 0;
        for(int i = 0; i < frequency.length; i++)
            if(frequency[i] == 1) 
                sum += i;
        return sum;
    }
}