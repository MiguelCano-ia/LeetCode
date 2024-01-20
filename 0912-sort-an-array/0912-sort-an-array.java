class Solution {
    public int[] sortArray(int[] nums) {
       if (nums.length == 1) {
            return nums;
        }

        int s = 0;
        int e = nums.length;
        int mid = (s + e) / 2;

        int[] left = sortArray(Arrays.copyOfRange(nums, s, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, e));

        return merge(left, right);
    }
    
    int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int m = 0;
        int j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[m] = left[i];
                m++;
                i++;
            } else {
                mix[m] = right[j];
                m++;
                j++;
            }
        }

        while (i < left.length) {
            mix[m] = left[i];
            m++;
            i++;
        }

        while (j < right.length) {
            mix[m] = right[j];
            m++;
            j++;
        }
        return mix;
    }
}