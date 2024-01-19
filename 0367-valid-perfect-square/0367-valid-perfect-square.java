class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num == 1 ? num : num / 2;

        while (s <= e) {
            long m = s + (e - s) / 2;
            long sq = m * m;

            if(sq == num) {
                return true;
            }

            if(sq > num) {
                e = (int)m - 1;
            } else if (sq < num) {
                s = (int)m + 1;
            }
        }
        return false;
    }
}