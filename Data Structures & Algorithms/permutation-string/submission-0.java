class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }


        int[] freq = new int[26];
        int[] window = new int[26];

        for(int i = 0 ; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }


        for(int i = s1.length(); i < s2.length(); i++){
            
            if(Arrays.equals(freq,window)){
                return true;
            }

            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - s1.length()) - 'a']--;

        }

          if(Arrays.equals(freq,window)){
                return true;
            }

           return false; 


    }
}
