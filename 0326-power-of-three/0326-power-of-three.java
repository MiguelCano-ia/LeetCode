class Solution {
    public boolean isPowerOfThree(int n) {
        if (n != 0 && n == Math.pow(3, (int)(Math.ceil(Math.log(n) / Math.log(3))))) {
            return true;
        }
        return false;
    }
}