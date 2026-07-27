class Solution {
    public int numDecodings(String s) {
        
        int n = s.length();
        int[] dp = new int[n+1];

        dp[0] = 1;

        if(s.charAt(0) == '0'){
            dp[1] = 0;
        }
        else dp[1] = 1;
       
       for(int i = 2; i <= n; i++){

        int oned = Integer.valueOf(s.substring(i-1,i));
        int twod = Integer.valueOf(s.substring(i-2,i));

         if( oned >= 1){
            dp[i] = dp[i] + dp[i-1]; 
         }        
         if( twod <= 26 && twod >= 10){
            dp[i] = dp[i] + dp[i-2];
         }
       }
  return dp[n];
    }
}