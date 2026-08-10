class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length - 1;
        int ans = Integer.MIN_VALUE;

        int l = 1;
        int r = 1;

        for(int i = 0; i < nums.length; i++){

            l = l * nums[i];
            r = r * nums[n - i];

            ans = Math.max(ans, Math.max(l, r));

            if(l == 0)
                l = 1;

            if(r == 0)
                r = 1;
               
        }
        return ans;
    }
}