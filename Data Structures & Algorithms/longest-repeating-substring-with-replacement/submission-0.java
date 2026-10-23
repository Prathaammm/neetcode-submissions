class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max = 0;
        int count = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            count = Math.max(count, freq[s.charAt(right) - 'A']);
            while(right - left - count + 1 > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
