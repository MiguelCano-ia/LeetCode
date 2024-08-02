class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int len = 0;
        int i = 0;

        if (nums.length == 0) {
            return result;
        }
        
        int start = nums[i];

        while (len < nums.length) {
            if (i + 1 < nums.length  && nums[i] + 1 == nums[i + 1]) {
                i++;
            } else if (start == nums[i]) {
                result.add(String.valueOf(nums[i]));
                i++;
                len = i;
                if (i < nums.length) {
                    start = nums[i];
                }
            } else {
                result.add(start + "->" + nums[i]);
                i++;
                len = i;
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }


        return result;
    }
}