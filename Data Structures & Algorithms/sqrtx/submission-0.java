class Solution {
    public int mySqrt(int x) {

        int left  = 0 ;
        int right = x;
        int ans = 1;
        
        while(left <= right){

            int mid = left + (right - left)/2;
            long sqrd = (long) mid * mid;

            if(sqrd == x){
                return mid;
            }
            if(sqrd < x){
                left = mid + 1;
                ans = mid;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}