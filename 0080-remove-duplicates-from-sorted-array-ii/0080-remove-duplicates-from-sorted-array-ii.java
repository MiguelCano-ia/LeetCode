class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        if (nums.length == 1) {
            return result + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            int cont = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (cont < 2 && nums[i] == nums[j]) {
                    int num = nums[i];
                    nums[result] = num;
                    nums[result + 1] = num;
                    i = j;
                    result += 2;
                    cont++;
                } else if (cont > 1 && nums[i] != nums[j]) {
                    i = j - 1;
                    break;
                } else if (cont == 1) {
                    int num = nums[i];
                    nums[result] = num;
                    result += 1;
                    break;
                } else if (j == nums.length - 1 && nums[i] == nums[j]) {
                    return result;
                }
            }
            if (i == nums.length - 1 && nums[i - 1] != nums[i]) {
                int num = nums[i];
                nums[result] = num;
                result += 1;
            }
        }
        return  result;
    }
}