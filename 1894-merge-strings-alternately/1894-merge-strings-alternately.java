class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
    
        int pointer1 = word1.length();
        int pointer2 = word2.length();
        
        while (pointer1 > 0 || pointer2 > 0) {
            if (pointer1 > 0) {
                result += word1.charAt(word1.length() - pointer1);
                pointer1--;
            }

            if (pointer2 > 0) {
                result += word2.charAt(word2.length() - pointer2);
                pointer2--;
            }
        }
        
        return result;
    }
}