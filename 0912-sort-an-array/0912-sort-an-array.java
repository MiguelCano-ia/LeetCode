class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length);
        return nums;
    }

    void mergeSort(int[] nums, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSort(nums, s, mid);
        mergeSort(nums, mid, e);

        merge(nums, s, mid, e);
    }
    
    void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}