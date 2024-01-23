class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> listHelp = new ArrayList<>();
        int index = 0;
        int total = 0;
        return helper(candidates, listHelp, target, index, result, total);
    }

    List<List<Integer>> helper(int[] candidates, List<Integer> listHelp, int target, int index, List<List<Integer>> result, int total) {
        if (total == target) {
            result.add(new ArrayList<>(listHelp));
            return result;
        }
        if (index >= candidates.length || total > target) {
            return result;
        }

        listHelp.add(candidates[index]);
        helper(candidates, listHelp, target, index, result, total + candidates[index]);
        listHelp.removeLast();
        helper(candidates, listHelp, target, index + 1, result, total);

        return result;
    }
}