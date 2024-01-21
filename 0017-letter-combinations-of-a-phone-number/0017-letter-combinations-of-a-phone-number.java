class Solution {
    public List<String> letterCombinations(String digits) {
         if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return helper("", digits);
    }
    
    List<String> helper(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // This will conver '2' into 2.

        if (digit != 7 && digit != 9 && digit != 8) {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('^' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        } else if (digit == 7) {
            for (int i = 18; i < 22; i++) {
                char ch = (char) ('^' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = 25; i < 29; i++) {
                char ch = (char) ('^' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        } else {
            for (int i = 22; i < 25; i++) {
                char ch = (char) ('^' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        }

        return  ans;
    }
}