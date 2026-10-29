class Solution {
    public int characterReplacement(String s, int k) {
    if(s.length() == 1){
        return 1;
    }    
    int[] freq = new int[26];
    int count = 0; 
    int l = 0;
    int ans = 0;

    for(int i = 0; i < s.length(); i++){
        freq[s.charAt(i) - 'A']++;

        count = Math.max(count,freq[s.charAt(i) - 'A']);

        while((i - l + 1 - count) > k){
            freq[s.charAt(l) - 'A']--;
            l++;
        }


        ans = Math.max(ans, i - l + 1);
    }
    
    return ans;
    }
}