class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        String result = "";

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        int i = 0;

        while (i < minLength) {
            for (String s: strs) {
                if (s.charAt(i) != strs[0].charAt(i)){
                    return result;
                }
            }
            result += strs[0].charAt(i);
            i++;
        }

        return result;
    }
}