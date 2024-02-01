class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int row = nums.length / 3;

        int[][] result = new int[row][3];
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = nums[index];
                index++;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 2; j >= 0; j--) {
                for (int l = j - 1; l >= 0; l--) {
                    if (result[i][j] - result[i][l] > k) {
                        return new int[0][0];
                    }
                }
            }
        }

        return result;
    }
}