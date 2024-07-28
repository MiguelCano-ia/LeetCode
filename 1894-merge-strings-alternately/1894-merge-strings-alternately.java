class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder result = new StringBuilder();

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < word1.length() && pointer2 < word2.length()) {
            result.append(word1.charAt(pointer1));
            result.append(word2.charAt(pointer2));
            pointer1++;
            pointer2++;
        }

        if (pointer1 < word1.length()) {
            result.append(word1.substring(pointer1));
        } else {
            result.append(word2.substring(pointer2));
        }

        return result.toString();
    }
}