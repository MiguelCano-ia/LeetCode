class Solution {
    public int findClosestNumber(int[] nums) {
        int closestNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(closestNumber) >= Math.abs(nums[i]) && Math.abs(nums[i]) == Math.abs(closestNumber)) {
                if (nums[i] < 0) continue;
                closestNumber = nums[i];
            } else if (Math.abs(closestNumber) > Math.abs(nums[i])) {
                closestNumber = nums[i];
            }
        }

        return closestNumber;
    }
}