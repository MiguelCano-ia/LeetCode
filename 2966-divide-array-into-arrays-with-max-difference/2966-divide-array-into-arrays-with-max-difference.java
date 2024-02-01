class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        boolean answer = satisfyConditions(nums, k);

        if (answer) {
            int row = nums.length / 3;

            int[][] result = new int[row][3];
            int index = 0;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i][j] = nums[index];
                    index++;
                }
            }
            return result;
        }

        return new int[0][0];
    }

    boolean satisfyConditions(int[] nums, int k) {
        for (int i = 2; i < nums.length; i+=3) {
            if (nums[i] - nums[i - 2] > k) {
                return false;
            }
        }
        return true;
    }
}