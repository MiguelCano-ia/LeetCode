class Solution {
    public int[][] divideArray(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        
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

    void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int p = nums[m];

        while(s <= e) {
            while (nums[s] < p) {
                s++;
            }

            while (nums[e] > p) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}