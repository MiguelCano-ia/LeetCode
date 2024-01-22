class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] result = new int[2];
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result[1] = index + 1;
                result[0] = nums[index];
            }
        }
        return result;
    }

    void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}