class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> f = new HashSet<>();
        for(int i=0; i<nums.length;i++){
           if(f.contains(nums[i])){
            return true;
           }
           else{
            f.add(nums[i]);
           }
        }
        return false;
    }
}