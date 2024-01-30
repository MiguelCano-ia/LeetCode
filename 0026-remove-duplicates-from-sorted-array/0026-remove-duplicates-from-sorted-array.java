class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int cont = 1;

        for (int i = j; i < nums.length; i++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] != nums[k]) {
                    nums[cont] = nums[k];
                    cont++;
                    j = k;
                    i = j - 1;
                    break;
                }
            }
        }
        return cont;
    }
}