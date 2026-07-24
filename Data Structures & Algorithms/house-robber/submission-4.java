class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0],nums[1]);
        }
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i<nums.length; i++){
            arr[i] = Math.max((nums[i] + arr[i-2]), arr[i-1]);
        }
        return arr[arr.length - 1];
    }
}
