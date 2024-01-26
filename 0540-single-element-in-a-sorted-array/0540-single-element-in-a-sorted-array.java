class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (s == e) {
                return nums[s];
            }

            if (m % 2 == 0) {
                if (nums[m] == nums[m + 1]) {
                    s = m + 2;
                } else {
                    e = m;
                }
            } else if (m % 2 == 1) {
                m -= 1;
                if (nums[m] == nums[m + 1]) {
                    s = m + 2;
                } else {
                    e = m;
                }
            }
        }
        return -1;
    }
}