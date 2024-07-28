class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < word1.length() && pointer2 < word2.length()) {
            result += word1.charAt(pointer1);
            result += word2.charAt(pointer2);
            pointer1++;
            pointer2++;
        }

        if (pointer1 < word1.length()) {
            result += word1.substring(pointer1);
        } else {
            result += word2.substring(pointer2);
        }

        return result;
    }
}