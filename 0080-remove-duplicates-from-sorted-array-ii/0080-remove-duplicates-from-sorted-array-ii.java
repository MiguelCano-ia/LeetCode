class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int result = 2; 
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[result - 2]) {
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }
}