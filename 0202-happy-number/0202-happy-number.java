class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = powerDigist(n);

        while(true) {
            if (sum == 1) {
                return true;
            } else if (list.contains(sum)) {
                return false;
            } else {
                list.add(sum);
                sum = powerDigist(sum);
            }
        }
    }

    int powerDigist(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 2);
            n /= 10;
        }

        return sum;
    }
}