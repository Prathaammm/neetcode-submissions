class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int m = cost.length;
        int[] mini  = new int[m];
        
        mini[0] = cost[0];
        mini[1] = cost[1];

        for(int i = 2; i<m; i++){
            mini[i] = Math.min(mini[i-1],mini[i-2]) + cost[i];
        }
        return Math.min(mini[m-1],mini[m-2]);
    }
}
