class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int limit;

    public KthLargest(int k, int[] nums) {
        limit = k;
        for(int i = 0; i < nums.length; i++){
            pq.offer(nums[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }

    }
    
    public int add(int val) {

        pq.offer(val);
        if(pq.size() > limit){
                pq.poll();
            }
        return pq.peek();
    }
}
