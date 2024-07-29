class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == 'I') {
                result += 1;
                if (i + 1 < s.length() && s.charAt(i + 1 ) == 'V') {
                    result += 3;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    result += 8;
                    i++;
                }
            } else if (current == 'V') {
                result += 5;
            } else if (current == 'X') {
                result += 10;
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    result += 30;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    result += 80;
                    i++;
                }
            } else if (current == 'L') {
                result += 50;
            } else if (current == 'C') {
                result += 100;
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    result += 300;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    result += 800;
                    i++;
                }
            } else if (current == 'D') {
                result += 500;
            } else if (current == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}