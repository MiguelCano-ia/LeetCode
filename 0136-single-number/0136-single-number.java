class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int e : nums) {
            unique ^= e; 
        }
        return unique;
    }
}