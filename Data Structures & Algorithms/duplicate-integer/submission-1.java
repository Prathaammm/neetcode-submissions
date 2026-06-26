class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> number = new HashSet<>();
        for (int i : nums) {
            if(number.contains(i)){
                return true;
            }
            number.add(i);
    }
    return false;
}
}