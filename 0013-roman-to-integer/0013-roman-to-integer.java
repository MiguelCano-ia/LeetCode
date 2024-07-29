class Solution {
    public int romanToInt(String s) {
        int result = 0, number = 0, prev = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }

            if (i < s.length() -1) {
                switch (s.charAt(i + 1)) {
                    case 'V' -> prev = 5;
                    case 'X' -> prev = 10;
                    case 'L' -> prev = 50;
                    case 'C' -> prev = 100;
                    case 'D' -> prev = 500;
                    case 'M' -> prev = 1000;
                    default -> prev = 0;
                }
            }

            if (prev > number) {
                result -= number;
            } else {
                result += number;
            }
        }
        return result;
    }
}