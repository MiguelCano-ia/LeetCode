class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j = 0;
        int cont = 1;

        for (int i = k; i < nums.length; i++) {
            j += 1;
            if (j >= nums.length) {
                return cont;
            }

            if (nums[i] != nums[j]) {
                nums[cont] = nums[j];
                cont++;
                k = j - 1;
                i = k;
            }
        }
        return cont;
    }
}