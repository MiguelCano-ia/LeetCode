class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (k >= 0) {
            if (Math.pow(nums[j], 2) < Math.pow(nums[i], 2)) {
                result[k] = (int) Math.pow(nums[i], 2);
                i++;
            } else {
                result[k] = (int) Math.pow(nums[j], 2);
                j--;
            }
            k--;
        }

        return result;
    }
}