class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        
        int length = 0;
        for (char c : s) {
            stack.push(c);
            length++;
        }
        
        for (int i = 0; i < length; i++) {
            s[i] = stack.pop();
        }
    }
}