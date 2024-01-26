class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (k >= 0) {
            if (Math.abs(nums[j]) < Math.abs(nums[i])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return result;
    }
}