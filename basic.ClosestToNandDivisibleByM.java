class Solution {
    static int closestNumber(int n, int m) {
        int q = n / m;
        
        int a = q * m;
        int b = (n * m > 0) ? (q + 1) * m : (q - 1) * m;

        if (Math.abs(n - a) < Math.abs(n - b)) {
            return a;
        } else if (Math.abs(n - a) > Math.abs(n - b)) {
            return b;
        } else {
            return Math.abs(a) > Math.abs(b) ? a : b;
        }
    }
}
