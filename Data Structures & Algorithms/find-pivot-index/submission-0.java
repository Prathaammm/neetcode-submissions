class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length - 1; 

        int[] left = new int[n+1];
        left[0] = nums[0];

        int[] right = new int[n+1];
        right[n] = nums[n];

        for(int i = 1; i<n; i++){
            left[i] = left[i-1] + nums[i];
        }

        for(int j = n-1; j >= 0; j--){
            right[j] = right[j + 1] + nums[j];
        }

        for(int i = 0; i < n+1; i++){
            int leftsum = (i == 0) ? 0 : left[i-1];
            int rightsum = (i == n) ? 0 : right[i+1];

            if(leftsum == rightsum){
                return i;
            }
        } 
        return -1;
    }
}