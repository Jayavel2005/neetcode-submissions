class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        boolean m = false;
        if ( n < 0) m = true;
        long power = n;
        power = Math.abs(power);
        while ( power > 0) {
            if ( power % 2 == 0) {
                x = x * x;
                power /= 2;
            }
            else {
                ans = ans * x;
                power--;
            }
        }

        if (m) return 1 / ans;
        return ans;
    }
}