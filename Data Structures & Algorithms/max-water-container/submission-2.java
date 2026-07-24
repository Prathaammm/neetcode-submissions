class Solution {
    public int maxArea(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j<arr.length; j++){
                int h = Math.min(arr[i],arr[j]);
                ans = Math.max(ans,(j-i)*h);
            }
        }
        return ans;
    }
}