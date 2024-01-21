class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return helper("", digits);
    }

    List<String> helper(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit == 7) ? 18 : (digit == 8) ? 22 : (digit == 9) ? 25 : (digit - 1) * 3;
        int end = (digit == 7) ? 22 : (digit == 8) ? 25 : (digit == 9) ? 29 : digit * 3;

        List<String> ans = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char) ('^' + i);
            ans.addAll(helper(p + ch, up.substring(1)));
        }

        return ans;
    }
}
