class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for( Map.Entry<Integer,Integer> x : map.entrySet()){
            int freq = x.getValue();
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(x.getKey());
        }

        int[] res = new int[k];
        int count = 0;

        for(int i = bucket.length - 1; i >= 1; i--){
            if(count == k){
                break;
            }

            if(bucket[i]  != null){
               for(int x : bucket[i]){
                if(count == k){
                    break;
                }
                res[count] = x;
                count++;
               }
            }
        }

        return res;
    }
}