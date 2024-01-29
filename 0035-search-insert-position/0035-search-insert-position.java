class Solution {
    public int searchInsert(int[] nums, int target) {
        int e = nums.length - 1;
        int s = 0;

        while (e >= s) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return m;
            }

            if (nums[m] < target) {
                s = m + 1;
            } else if (nums[m] > target) {
                e = m - 1;
            }
        }

        return s;
    }
}