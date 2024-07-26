class Solution {
    public int findClosestNumber(int[] nums) {
        int closestNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (Math.abs(closestNumber) > Math.abs(currentNumber) ||
            Math.abs(closestNumber) == Math.abs(currentNumber) && currentNumber > closestNumber) {
                closestNumber = currentNumber;
            }
        }

        return closestNumber;
    }
}