class RecentCounter {

    ArrayList<Integer> counter;

    public RecentCounter() {
        counter = new ArrayList<>();
        counter.add(null);
    }
    
    public int ping(int t) {
        counter.add(t);
        int low = t - 3000;
        int i = 1;
        for(; i < counter.size(); i++){
            if(counter.get(i) >= low)
                break;
        }
        return counter.size() - i;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */