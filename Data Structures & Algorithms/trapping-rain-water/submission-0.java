class Solution {
    public int trap(int[] nums) {
        int ans = 0;

        if(nums.length == 0) return 0;
        int[] lmax = new int[nums.length];
        lmax[0] = nums[0];
        int[] lmin = new int[nums.length];
        lmin[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i<nums.length; i++){
            lmax[i] = Math.max(lmax[i-1],nums[i]);
        }
        for(int i = nums.length - 2; i>=0; i--){
            lmin[i] = Math.max(lmin[i+1],nums[i]);
        }

       for(int i = 0; i < nums.length; i++){
            int watr = Math.min(lmax[i],lmin[i]) - nums[i];
            ans = ans + watr;
        }
        return ans;
    }    
}

