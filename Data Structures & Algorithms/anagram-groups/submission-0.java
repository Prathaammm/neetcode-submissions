class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List> map = new HashMap<>();

        for(String s : strs){         // String s = Tea;

            int[] count = new int[26];   // {0,0,0,0,0,.,,,,,,.}         
            
            for(int i = 0; i < s.length(); i++){  // 
                count[s.charAt(i) - 'a']++;  //{  T=1, E=1, A = 1}{ 1,00000,1,,,,1}
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < count.length; i++){  
                sb.append("#");
                sb.append(count[i]);  // #1#0.......#1,,,,,,,#0
            }

            String k = sb.toString();
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<String>());
            }
            map.get(k).add(s);
        }
        return new ArrayList(map.values());
    }
}
