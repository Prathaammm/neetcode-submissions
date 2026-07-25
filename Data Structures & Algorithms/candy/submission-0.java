class Solution {
    public int candy(int[] arr) {
        int[] nums = new int[arr.length];
    
          nums[0] = 1;

        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] < arr[i]){
                nums[i] = nums[i-1] + 1;
            }
            else{
                nums[i] = 1;
            }
        }

         for(int i = arr.length - 2; i>=0; i--){
            if(arr[i] > arr[i+1]){
                nums[i] = Math.max (nums[i+1] + 1,nums[i]);
            }
        }
        int ans = 0;
      for (int candy : nums) {
    ans += candy;
}
return ans;
    }
}