class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int x = a;
        int y = b;

        // Calculate GCD using Euclidean algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a / gcd) * b;

        return new int[]{lcm, gcd};
    }
}
