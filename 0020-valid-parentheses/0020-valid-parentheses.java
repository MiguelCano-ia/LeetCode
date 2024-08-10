class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Stack<Character> valid = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                valid.push('(');
            } else if (s.charAt(i) == '[') {
                valid.push('[');
            } else if (s.charAt(i) == '{') {
                valid.push('{');
            } else {
                if (!valid.empty()) {
                    if (valid.peek() == '(' && s.charAt(i) == ')') {
                        valid.pop();
                    } else if (valid.peek() == '[' && s.charAt(i) == ']') {
                        valid.pop();
                    } else if (valid.peek() == '{' && s.charAt(i) == '}') {
                        valid.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return valid.empty();
    }
}