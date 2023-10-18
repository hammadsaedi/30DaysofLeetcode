class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int e : nums1) set1.add(e);
        for(int e : nums2) set2.add(e);

        for(int e : set1) if(!set2.contains(e)) l1.add(e);
        for(int e : set2) if(!set1.contains(e)) l2.add(e);

        ans.add(l1);
        ans.add(l2);
    
        return ans;
    }
}
